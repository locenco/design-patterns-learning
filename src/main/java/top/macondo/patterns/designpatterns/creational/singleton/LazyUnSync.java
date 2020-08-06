package top.macondo.patterns.designpatterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 懒汉式，线程不安全
 * @author: Zhang Chong
 * @create: 2019-01-16 16:51
 **/
public class LazyUnSync {
	private static LazyUnSync instance;

	private LazyUnSync() {
	}

	public static LazyUnSync getInstance() {
		if (instance == null) {
			instance = new LazyUnSync();
		}
		return instance;
	}

}
