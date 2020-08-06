package top.macondo.patterns.designpatterns.structural.flyWeight;

import org.junit.jupiter.api.Test;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/11 22:32
 **/
public class JdkSourceDemo {
	@Test
	public void integerTest() {
		Integer i1 = 12;
		Integer i2 = 12;
		System.out.println(i1 == i2);

		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);

	}
}
