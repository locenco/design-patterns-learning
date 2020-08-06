package top.macondo.patterns.designpatterns.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/11 15:15
 **/
public class Agent implements MethodInterceptor {

	private Person target;

	public Object getProxyInstance(Object target) {
		// 通过CGLIB动态代理获取代理对象的过程
		Enhancer enhancer = new Enhancer();
		// 设置enhancer对象的父类
		enhancer.setSuperclass(target.getClass());
		// 设置enhancer的回调对象
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

		System.out.println("经纪公司:接单");
		methodProxy.invokeSuper(o, objects);
		System.out.println("经纪公司收钱:");
		return null;
	}
}
