package top.macondo.patterns.designpatterns.structural.bridge;

/**
 * zhangchong
 **/
public interface MessageService {
	boolean sendMessage(String payload, String topic);
}
