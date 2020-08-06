package top.macondo.patterns.designpatterns.creational.builder.food;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:28
 **/
public class Pepsi extends BaseColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 5.0f;
	}
}
