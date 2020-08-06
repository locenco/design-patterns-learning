package top.macondo.patterns.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * //原理：
 * //1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
 * //2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
 * //3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
 * //4、编译新生成的Java代码.class
 * //5、再重新加载到JVM中运行
 * //以上这个过程就叫字节码重组
 * <p>
 * //JDK中有个规范，只要要是$开头的一般都是自动生成的
 * <p>
 * //通过反编译工具可以查看源代码
 * byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
 * FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
 * os.write(bytes);
 * os.close();
 */

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/10 22:28
 **/

public class DynamicProxyJdkDemo {
	/**
	 * 疑问？
	 * //TODO 打断点为什么会多次执行invoke方法
	 */
	@Test
	public void dynamicProxyJdkDemo() {
		BuyHouse buyHouse = new BuyHouseImpl();
		BuyHouse buyHouseProxy = new DynamicProxyHandler(buyHouse).getProxy();
		buyHouseProxy.buyHouse();
	}

	interface BuyHouse {
		void buyHouse();

		void decorateHouse();
	}

	class BuyHouseImpl implements BuyHouse {

		@Override
		public void buyHouse() {
			System.out.println("面朝大海，春暖花开");
		}

		@Override
		public void decorateHouse() {
			System.out.println("房子装修");
		}
	}

	class DynamicProxyHandler implements InvocationHandler {
		private Object target;

		public DynamicProxyHandler(Object target) {
			super();
			this.target = target;
		}

		/**
		 * 获取被代理接口实例对象
		 *
		 * @param <T>
		 * @return
		 */
		public <T> T getProxy() {
			return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("存钱买房");
			Object result = method.invoke(target, args);
			System.out.println("吃土");
			return result;
		}
	}
}
