package top.macondo.patterns.designpatterns.creational.factory;

/**
 * @program: designpatterns
 * @description: 蜂鸟
 * @author: Zhang Chong
 * @create: 2019-01-11 17:56
 **/
public class Hummingbird implements Animal {
	@Override
	public void infomation() {
		System.out.println(Hummingbird.class);
	}
}
