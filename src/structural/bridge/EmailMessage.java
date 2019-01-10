package structural.bridge;

public class EmailMessage extends Message {

	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		this.messageSender.sendMessage();

	}

}
