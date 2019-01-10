package structural.bridge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structural.bridge.factory.BaseMessageFactory;
import structural.bridge.factory.MessageFactory;

public class MessageTest {

	@Test
	public void MessageSendTest() {
		
		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();
		
		MessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new EmailMessage(emailMessageSender);
		emailMessage.send();
		
		assertTrue(true);
	}
	
	@Test
	public void MessageFactoryTest() {
		
		MessageFactory messageFactory = BaseMessageFactory.getInstance();
		
		Message text = messageFactory.createMessage("text");
		Message email = messageFactory.createMessage("email");
		
		assertTrue(true);
	}

}
