package structural.bridge;

public abstract class Message {

	MessageSender messageSender;

	public Message(MessageSender messageSender) {
		super();
		this.messageSender = messageSender;
	}

	public abstract void send();

}
