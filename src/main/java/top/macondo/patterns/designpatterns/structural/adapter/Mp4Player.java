package top.macondo.patterns.designpatterns.structural.adapter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 11:39
 **/
public class Mp4Player implements MediaPlayer {
	@Override
	public void mp4Player(String fileName) {
		System.out.println("mp4 playing..." + fileName);
	}

	@Override
	public void aviPlayer(String fileName) {

	}
}
