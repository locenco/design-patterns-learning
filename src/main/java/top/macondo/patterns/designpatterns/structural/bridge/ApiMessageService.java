package top.macondo.patterns.designpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * zhangchong
 **/
@Slf4j
public class ApiMessageService implements MessageService {
	@Override
	public boolean sendMessage(String payload, String topic) {
		//TODO
		log.info("send {} to {} by api", payload, topic);
		return true;
	}
}
