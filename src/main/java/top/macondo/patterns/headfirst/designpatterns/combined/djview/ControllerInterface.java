package top.macondo.patterns.headfirst.designpatterns.combined.djview;

public interface ControllerInterface {
	void start();

	void stop();

	void increaseBPM();

	void decreaseBPM();

	void setBPM(int bpm);
}
