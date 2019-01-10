package structural.bridge;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("EmailMessageSender: Sending text message...");

	}

}
