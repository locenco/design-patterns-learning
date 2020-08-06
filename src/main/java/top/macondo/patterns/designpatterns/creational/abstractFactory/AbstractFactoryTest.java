package top.macondo.patterns.designpatterns.creational.abstractFactory;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 16:44
 **/
public class AbstractFactoryTest {
	public static void main(String[] args) {
		AbstractFactory animalFactory = FactoryProducer.getFactory("ANIMAL");
		Animal animal = animalFactory.getAnimal("ANT");
		animal.infomation();
	}
}
