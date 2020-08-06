package top.macondo.patterns.designpatterns.structural.flyWeight;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/11 19:27
 **/
public abstract class FlyWeight {

	private final String extrinsic;
	@Setter
	@Getter
	private String intrinsic;

	public FlyWeight(String extrinsic) {
		this.extrinsic = extrinsic;
	}

	public abstract void operate();
}
