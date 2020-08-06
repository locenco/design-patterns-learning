package top.macondo.patterns.designpatterns.creational.builder.food;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:25
 **/
public class ChickenBurger extends BaseBurger {
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 51.0f;
	}
}
