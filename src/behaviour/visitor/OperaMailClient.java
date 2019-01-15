package behaviour.visitor;

public class OperaMailClient implements MailClient {

	@Override
	public void sendMail(final String[] mailInfo) {
		System.out.println(" OperaMailClient: Sending mail");
	}

	@Override
	public void receiveMail(final String[] mailInfo) {
		System.out.println(" OperaMailClient: Receiving mail");
	}

	@Override
	public boolean accept(final MailClientVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}
