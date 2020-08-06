package top.macondo.patterns.designpatterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author: Zhang Chong
 * @create: 2019-01-16 16:59
 **/
public class LazyDoublecheck {
	private volatile static LazyDoublecheck instance;

	private LazyDoublecheck() {
	}

	public static LazyDoublecheck getInstance() {
		if (instance == null) {
			synchronized (LazyDoublecheck.class) {
				if (instance == null) {
					instance = new LazyDoublecheck();
				}
			}
		}
		return instance;
	}
}
