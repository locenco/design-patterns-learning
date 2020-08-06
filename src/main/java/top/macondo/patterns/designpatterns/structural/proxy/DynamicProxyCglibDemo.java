package top.macondo.patterns.designpatterns.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * @program: designpatterns
 * @description: cglib 动态代理测试
 * @author: Zhang Chong
 * @create: 2019/10/11 14:05
 **/
public class DynamicProxyCglibDemo {

	/**
	 * java.lang.IllegalArgumentException: Superclass has no null constructors but no arguments were given
	 * 内部类引发的cglib创建失败
	 * <p>
	 * <p>
	 * 报错显示创建的时候没有给构造方法参数，明显看上去Student1使用的是默认构造方法，不需要参数啊。
	 * 为了看究竟，查看Student1的反射方法，构造方法果然有一个参数，类型是CglibTest...
	 * 原来是通过构造方法外部类被传入了内部类，这也是为什么内部类可以直接调用外部类的成员了。
	 * 详细参考：
	 * [url]http://www.2cto.com/kf/201402/281879.html[/url]
	 * 要点：
	 * 1 编译器自动为内部类添加一个成员变量， 这个成员变量的类型和外部类的类型相同， 这个成员变量就是指向外部类对象的引用；
	 * 2 编译器自动为内部类的构造方法添加一个参数， 参数的类型是外部类的类型， 在构造方法内部使用这个参数为1中添加的成员变量赋值；
	 * 3 在调用内部类的构造函数初始化内部类对象时， 会默认传入外部类的引用。
	 * <p>
	 * [b]3. 问题解决[/b]
	 * 三种方法：
	 * 1. 把Student1定义成static 内部类
	 * 2. 把Student1拿到外面单独定义
	 * 3. cglib创建时传入外部类对象：
	 * enhancer.create(new Class[]{CglibTest.class}, new Object[]{this});
	 */
	@Test
	public void test() {
		TestDemo testDemo = new TestDemo();
		TestDemo testDemoProxy = (TestDemo) new CglibProxyFactory().getProxyFactory(testDemo);
		testDemoProxy.sout();
	}

	@Test
	public void test1() {
		Singer singer = (Singer) new Agent().getProxyInstance(new Singer());
		singer.doSomething();
	}

	interface BuyHouse {
		void buyHouse();

		void decorateHouse();
	}

	public static class TestDemo {

		public void sout() {
			System.out.println("aaaa有问题？");
		}
	}

	class CglibProxyFactory implements MethodInterceptor {
		private Object object;

		public Object getProxyFactory(Object object) {
			this.object = object;
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(this.object.getClass());
			enhancer.setCallback(this);
			return enhancer.create();
		}

		@Override
		public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
			System.out.println("事务开启...");
			Object result = methodProxy.invokeSuper(o, objects);
			System.out.println("事务结束...");

			return result;
		}
	}
}
