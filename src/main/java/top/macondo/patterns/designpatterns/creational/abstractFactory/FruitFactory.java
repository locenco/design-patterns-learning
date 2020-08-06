package top.macondo.patterns.designpatterns.creational.abstractFactory;

/**
 * @program: designpatterns
 * @description: 水果工厂
 * @author: Zhang Chong
 * @create: 2019-01-14 16:34
 **/
public class FruitFactory extends AbstractFactory {
	@Override
	public Fruits getFruits(String fruits) {
		if (fruits == null) {
			return null;
		}
		if (fruits.equalsIgnoreCase("ORANGE")) {
			return new orange();
		} else if (fruits.equalsIgnoreCase("APPLE")) {
			return new Apple();
		}
		return null;
	}

	@Override
	public Animal getAnimal(String animal) {
		return null;
	}
}
