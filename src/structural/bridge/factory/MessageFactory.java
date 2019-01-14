package structural.bridge.factory;

import structural.bridge.Message;

public interface MessageFactory {

	Message createMessage(String type);

}
