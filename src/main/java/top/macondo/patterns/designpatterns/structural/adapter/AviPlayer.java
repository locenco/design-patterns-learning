package top.macondo.patterns.designpatterns.structural.adapter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 11:40
 **/
public class AviPlayer implements MediaPlayer {
	@Override
	public void mp4Player(String fileName) {

	}

	@Override
	public void aviPlayer(String fileName) {
		System.out.println("avi playing..." + fileName);
	}
}
