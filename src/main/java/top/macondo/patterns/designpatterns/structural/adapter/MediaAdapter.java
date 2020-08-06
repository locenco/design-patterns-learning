package top.macondo.patterns.designpatterns.structural.adapter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 11:43
 **/
public class MediaAdapter implements MusicPlayer {

	MediaPlayer mediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase(AudioType.AVI.getType())) {
			mediaPlayer = new AviPlayer();
		} else if (audioType.equalsIgnoreCase(AudioType.MP4.getType())) {
			mediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase(AudioType.AVI.getType())) {
			mediaPlayer.aviPlayer(fileName);
		} else if (audioType.equalsIgnoreCase(AudioType.MP4.getType())) {
			mediaPlayer.mp4Player(fileName);
		}
	}
}
