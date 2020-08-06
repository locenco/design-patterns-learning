package top.macondo.patterns.designpatterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 懒汉式，线程安全
 * 加锁后效率低
 * @author: Zhang Chong
 * @create: 2019-01-16 16:54
 **/
public class LazySync {
	private static LazySync instance;

	private LazySync() {
	}

	public static synchronized LazySync getInstance() {
		if (instance == null) {
			instance = new LazySync();
		}
		return instance;
	}
}
