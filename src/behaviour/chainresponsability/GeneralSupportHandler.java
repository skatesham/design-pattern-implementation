package behaviour.chainresponsability;

public class GeneralSupportHandler extends AbstractSupportHandler {

	public GeneralSupportHandler(final int level) {
		this.level = level;
	}

	@Override
	protected void handlerRequest(final String message) {
		System.out.println("GeneralSupportHandler: Processing request. " + message);
	}

}
