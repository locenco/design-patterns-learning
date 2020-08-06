package top.macondo.patterns.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/17 8:50
 **/
public class TestClass {
	@Test
	public void testDecorator() {
		ConcreteComponent concreteComponent = new ConcreteComponent();
		System.out.println(concreteComponent.login("小伟", "xiaowei"));

		Decorator decorator = new Decorator(concreteComponent);
		System.out.println(decorator.loginForWx("小辉", "xiaohui"));

	}
}
