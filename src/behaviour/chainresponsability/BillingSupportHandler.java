package behaviour.chainresponsability;

public class BillingSupportHandler extends AbstractSupportHandler {

	public BillingSupportHandler(final int level) {
		this.level = level;
	}

	@Override
	protected void handlerRequest(final String message) {
		System.out.println("BillingSupportHandler: Processing request. " + message);
	}

}
