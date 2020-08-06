package top.macondo.patterns.designpatterns.structural.bridge;

/**
 * zhangchong
 **/
public abstract class MessageHandler {
	protected MessageService messageService;

	public MessageHandler(MessageService messageService) {
		this.messageService = messageService;
	}

	public boolean send(String payload, String topic) {
		return this.messageService.sendMessage(payload, topic);
	}

}
