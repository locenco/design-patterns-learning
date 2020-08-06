package top.macondo.patterns.designpatterns.structural.proxy;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/11 15:14
 **/
public class Singer implements Person {

	@Override
	public void doSomething() {
		System.out.println("歌手，负责唱歌");
	}
}
