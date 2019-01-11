package structural.bridge;

public class EmailMessage extends Message {

	public EmailMessage(final MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		this.messageSender.sendMessage();

	}

}
