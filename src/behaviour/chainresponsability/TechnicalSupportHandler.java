package behaviour.chainresponsability;

public class TechnicalSupportHandler extends AbstractSupportHandler {

	public TechnicalSupportHandler(final int level) {
		this.level = level;
	}

	@Override
	protected void handlerRequest(final String message) {

		System.out.println("TechnicalSupportHandler: Processing Request " + message);
	}

}
