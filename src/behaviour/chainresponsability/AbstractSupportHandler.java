package behaviour.chainresponsability;

import lombok.Setter;

@Setter
public abstract class AbstractSupportHandler {

	public static int TECHNICAL = 10;
	public static int BILLING = 20;
	public static int GENERAL = 30;

	protected int level;

	protected AbstractSupportHandler nextHandler;

	public void receiveRequest(final int level, final String message) {
		if (this.level <= level) {
			handlerRequest(message);
		}
		if (nextHandler != null) {
			nextHandler.receiveRequest(level, message);
		}
	}

	protected abstract void handlerRequest(String message);

}
