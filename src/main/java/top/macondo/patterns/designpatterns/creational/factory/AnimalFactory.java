package top.macondo.patterns.designpatterns.creational.factory;

/**
 * @program: designpatterns
 * @description: 动物工厂类
 * @author: Zhang Chong
 * @create: 2019-01-11 18:00
 **/
public class AnimalFactory {
	public Animal getAnimal(String animalName) {
		if (animalName == null) {
			return null;
		}
		switch (animalName.toLowerCase()) {
			case "ant":
				return new Ant();
			case "hummingbird":
				return new Hummingbird();
			default:
				return null;
		}
	}
}
