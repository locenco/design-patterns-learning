package top.macondo.patterns.designpatterns.structural.adapter;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019-01-23 11:41
 **/
public class AudioPlayer implements MusicPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase(AudioType.MP3.getType())) {
			System.out.println("mp3 playing..." + fileName);
		} else if (audioType.equalsIgnoreCase(AudioType.AVI.getType())
				|| audioType.equalsIgnoreCase(AudioType.MP4.getType())) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " +
					audioType + " format not supported");
		}

	}
}
