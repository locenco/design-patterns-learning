package top.macondo.patterns.designpatterns.creational.abstractFactory;


/**
 * @program: designpatterns
 * @description: 抽象工厂
 * @author: Zhang Chong
 * @create: 2019-01-16 16:32
 **/
public abstract class AbstractFactory {
	public abstract Fruits getFruits(String fruits);

	public abstract Animal getAnimal(String animal);
}
