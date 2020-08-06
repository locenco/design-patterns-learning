package top.macondo.patterns.designpatterns.creational.prototype;

/**
 * @program: designpatterns
 * @description: 蚂蚁
 * @author: Zhang Chong
 * @create: 2019-01-12 10:52
 **/
public class Ant extends Animal {
	public Ant() {
		type = "Ant";
	}

	@Override
	public void infomation() {
		System.out.println(Ant.class);
	}
}
