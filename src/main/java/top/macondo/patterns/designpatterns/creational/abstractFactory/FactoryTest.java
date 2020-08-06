package top.macondo.patterns.designpatterns.creational.abstractFactory;

/**
 * @program: designpatterns
 * @description: 工厂模式测试类
 * @author: Zhang Chong
 * @create: 2019-01-12 11:39
 **/
public class FactoryTest {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.getAnimal("Ant");
		animal.infomation();
		Animal animal1 = animalFactory.getAnimal("hummingbird");
		animal1.infomation();
	}
}
