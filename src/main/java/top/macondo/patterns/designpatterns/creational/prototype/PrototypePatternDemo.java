package top.macondo.patterns.designpatterns.creational.prototype;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 11:02
 **/
public class PrototypePatternDemo {
	public static void main(String[] args) {
		AnimalCache.loadCache();
		Animal animal1 = AnimalCache.getAnimal("1");
		System.out.printf(animal1.getType());
	}
}
