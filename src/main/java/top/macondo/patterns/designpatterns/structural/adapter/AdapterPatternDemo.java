package top.macondo.patterns.designpatterns.structural.adapter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 13:48
 **/
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "mp3 ++");
		audioPlayer.play("mp4", "mp4 ++");
		audioPlayer.play("avi", "avi ++");
		audioPlayer.play("vlc", "vlc ++");
	}

}
