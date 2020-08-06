package top.macondo.patterns.designpatterns.creational.abstractFactory;

/**
 * @program: designpatterns
 * @description: 动物工厂类
 * @author: Zhang Chong
 * @create: 2019-01-11 18:00
 **/
public class AnimalFactory extends AbstractFactory {
	@Override
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

	@Override
	public Fruits getFruits(String fruits) {
		return null;
	}

}
