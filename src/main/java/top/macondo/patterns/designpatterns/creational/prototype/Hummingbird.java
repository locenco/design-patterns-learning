package top.macondo.patterns.designpatterns.creational.prototype;

/**
 * @program: designpatterns
 * @description: 蜂鸟
 * @author: Zhang Chong
 * @create: 2019-01-11 17:56
 **/
public class Hummingbird extends Animal {
	public Hummingbird() {
		type = "Hummingbird";
	}

	@Override
	public void infomation() {
		System.out.println(Hummingbird.class);
	}
}
