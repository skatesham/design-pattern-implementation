package behaviour.visitor;

public class WindowsMailClientVisitor implements MailClientVisitor {

	@Override
	public void visit(final OperaMailClient mailClient) {
		System.out.println("Configuration of Opera mail client for Windows complete");
	}

	@Override
	public void visit(final SquirrelMailClient mailClient) {
		System.out.println("Configuration of Squirrel mail client for Windows complete");

	}

	@Override
	public void visit(final ZimbraMailClient mailClient) {
		System.out.println("Configuration of Zimbra mail client for Windows complete");

	}

}
