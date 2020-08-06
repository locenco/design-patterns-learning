package top.macondo.patterns.designpatterns.structural.bridge;

import org.junit.Test;

/**
 * zhangchong
 **/
public class BridgeClient {
	@Test
	public void testMessage() {
		MessageHandler messageHandler = new MonitorMessageHandler(new ApiMessageService());
		messageHandler.send("123", "zhangsan");
	}
}
