package top.macondo.patterns.designpatterns.creational.builder.food;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:27
 **/
public class Coke extends BaseColdDrink {
	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 5.0f;
	}
}
