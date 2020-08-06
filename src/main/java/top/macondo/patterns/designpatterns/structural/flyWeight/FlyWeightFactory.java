package top.macondo.patterns.designpatterns.structural.flyWeight;

import java.util.HashMap;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/11 22:22
 **/
public class FlyWeightFactory {

	private static HashMap<String, FlyWeight> pool = new HashMap<>();

	public static FlyWeight getFlyWeight(String extrinsic) {
		FlyWeight flyWeight = null;
		if (pool.containsKey(extrinsic)) {
			flyWeight = pool.get(extrinsic);
		} else {
			flyWeight = new ConcreteFlyweight(extrinsic);
		}
		return flyWeight;
	}

}
