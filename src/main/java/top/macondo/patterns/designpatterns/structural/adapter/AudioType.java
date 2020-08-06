package top.macondo.patterns.designpatterns.structural.adapter;

public enum AudioType {
	AVI("avi"),
	MP3("mp3"),
	MP4("mp4");

	private String type;

	AudioType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
