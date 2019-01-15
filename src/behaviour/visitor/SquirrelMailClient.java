package behaviour.visitor;

public class SquirrelMailClient implements MailClient {
	@Override
	public void sendMail(final String[] mailInfo) {
		System.out.println(" SquirrelMailClient: Sending mail");
	}

	@Override
	public void receiveMail(final String[] mailInfo) {
		System.out.println(" SquirrelMailClient: Receiving mail");
	}

	@Override
	public boolean accept(final MailClientVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}
