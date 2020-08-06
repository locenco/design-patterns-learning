package top.macondo.patterns.designpatterns.creational.builder.food;

import top.macondo.patterns.designpatterns.creational.builder.Item;
import top.macondo.patterns.designpatterns.creational.builder.Package.Packing;
import top.macondo.patterns.designpatterns.creational.builder.Package.Wrapper;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:21
 **/
public abstract class BaseBurger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
