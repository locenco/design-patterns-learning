package top.macondo.patterns.designpatterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 饿汉式
 * @author: Zhang Chong
 * @create: 2019-01-16 16:57
 **/
public class UnLazy {
	private static UnLazy instance = new UnLazy();

	private UnLazy() {
	}

	public static UnLazy getInstance() {
		return instance;
	}
}
