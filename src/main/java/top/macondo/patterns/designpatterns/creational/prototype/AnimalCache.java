package top.macondo.patterns.designpatterns.creational.prototype;

import java.util.HashMap;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 10:58
 **/
public class AnimalCache {
	private static HashMap<String, Animal> animalCache = new HashMap<>();

	public static Animal getAnimal(String animalId) {
		Animal cacheAnimal = animalCache.get(animalId);
		return (Animal) cacheAnimal.clone();
	}

	public static void loadCache() {
		Ant ant = new Ant();
		ant.setId("1");
		animalCache.put(ant.getId(), ant);

		Hummingbird hummingbird = new Hummingbird();
		hummingbird.setId("2");
		animalCache.put(hummingbird.getId(), hummingbird);
	}
}
