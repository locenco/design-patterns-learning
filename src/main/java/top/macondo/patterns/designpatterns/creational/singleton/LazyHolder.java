package top.macondo.patterns.designpatterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 登记式/静态内部类
 * @author: Zhang Chong
 * @create: 2019-01-16 17:07
 **/
public class LazyHolder {
	private static class MyLazyHolder {
		private static final LazyHolder INSTANCE = new LazyHolder();
	}

	private LazyHolder() {
	}

	public static final LazyHolder getInstance() {
		return MyLazyHolder.INSTANCE;
	}

}
