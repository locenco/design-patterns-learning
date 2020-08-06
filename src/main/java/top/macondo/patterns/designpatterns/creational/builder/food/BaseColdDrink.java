package top.macondo.patterns.designpatterns.creational.builder.food;

import top.macondo.patterns.designpatterns.creational.builder.Item;
import top.macondo.patterns.designpatterns.creational.builder.Package.Bottle;
import top.macondo.patterns.designpatterns.creational.builder.Package.Packing;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:26
 **/
public abstract class BaseColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
