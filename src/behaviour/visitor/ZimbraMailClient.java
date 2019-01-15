package behaviour.visitor;

public class ZimbraMailClient implements MailClient {

	@Override
	public void sendMail(final String[] mailInfo) {
		System.out.println(" ZimbraMailClient: Sending mail");
	}

	@Override
	public void receiveMail(final String[] mailInfo) {
		System.out.println(" ZimbraMailClient: Receiving mail");
	}

	@Override
	public boolean accept(final MailClientVisitor visitor) {
		visitor.visit(this);
		return true;
	}
}
