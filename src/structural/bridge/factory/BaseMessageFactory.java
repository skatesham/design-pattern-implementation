package structural.bridge.factory;

import structural.bridge.EmailMessage;
import structural.bridge.EmailMessageSender;
import structural.bridge.Message;
import structural.bridge.MessageSender;
import structural.bridge.TextMessage;
import structural.bridge.TextMessageSender;

public class BaseMessageFactory implements MessageFactory {

	private static BaseMessageFactory instance;

	public static BaseMessageFactory getInstance() {
		if (instance == null) {
			instance = new BaseMessageFactory();
		}
		return instance;
	}

	private BaseMessageFactory() {
	}

	@Override
	public Message createMessage(final String type) {

		Message message;
		MessageSender messageSender;
		switch (type.toLowerCase()) {
		case "text":
			messageSender = new TextMessageSender();
			message = new TextMessage(messageSender);
			break;
		case "email":
			messageSender = new EmailMessageSender();
			message = new EmailMessage(messageSender);
			break;
		default:
			throw new IllegalArgumentException();
		}
		message.send();
		return message;
	}

}
