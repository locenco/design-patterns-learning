package top.macondo.patterns.designpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * zhangchong
 **/
@Slf4j
public class MonitorMessageHandler extends MessageHandler {
	public MonitorMessageHandler(MessageService messageService) {
		super(messageService);
	}

	@Override
	public boolean send(String payload, String topic) {
		log(payload);
		return super.send("monitor: " + payload, topic);
	}

	public void log(String payload) {
		log.info("monitor: " + payload);
	}
}
