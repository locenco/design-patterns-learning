package top.macondo.patterns.designpatterns.creational.builder.food;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:23
 **/
public class VeBurger extends BaseBurger {
	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
