package top.macondo.patterns.designpatterns.creational.builder;

import top.macondo.patterns.designpatterns.creational.builder.food.ChickenBurger;
import top.macondo.patterns.designpatterns.creational.builder.food.Coke;
import top.macondo.patterns.designpatterns.creational.builder.food.Pepsi;
import top.macondo.patterns.designpatterns.creational.builder.food.VeBurger;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-16 17:39
 **/
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VeBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareMonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
