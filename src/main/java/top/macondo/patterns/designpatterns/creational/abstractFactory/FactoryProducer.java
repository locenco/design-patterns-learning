package top.macondo.patterns.designpatterns.creational.abstractFactory;

/**
 * @program: designpatterns
 * @description: 工厂生成器
 * @author: Zhang Chong
 * @create: 2019-01-16 16:40
 **/
public class FactoryProducer {
	public static final String ANIMAL = "ANIMAL";
	public static final String FRUIT = "FRUIT";

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase(ANIMAL)) {
			return new AnimalFactory();
		} else if (FRUIT.equalsIgnoreCase(choice)) {
			return new FruitFactory();
		}
		return null;
	}
}
