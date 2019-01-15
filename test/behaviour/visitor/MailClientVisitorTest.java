package behaviour.visitor;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MailClientVisitorTest {

	private OperaMailClient operaMailClient;
	private SquirrelMailClient squirrelMailClient;
	private ZimbraMailClient zimbraMailClient;
	private MacMailClientVisitor macMailClientVisitor;
	private WindowsMailClientVisitor windowsMailClientVisitor;
	private LinuxMailClientVisitor linuxMailClientVisitor;

	@Before
	public void setup() {
		this.operaMailClient = new OperaMailClient();
		this.squirrelMailClient = new SquirrelMailClient();
		this.zimbraMailClient = new ZimbraMailClient();
		this.macMailClientVisitor = new MacMailClientVisitor();
		this.windowsMailClientVisitor = new WindowsMailClientVisitor();
		this.linuxMailClientVisitor = new LinuxMailClientVisitor();
	}

	@Test
	public void OperaMailClientTest() {
		System.out.println("-----Testing Opera Mail Client for different environments-----");
		assertTrue(operaMailClient.accept(macMailClientVisitor));
		assertTrue(operaMailClient.accept(linuxMailClientVisitor));
		assertTrue(operaMailClient.accept(windowsMailClientVisitor));
		System.out.println();
	}

	@Test
	public void SquireMailClientTest() {
		System.out.println("\n-----Testing Squirrel Mail Client for different environments-----");
		assertTrue(squirrelMailClient.accept(macMailClientVisitor));
		assertTrue(squirrelMailClient.accept(linuxMailClientVisitor));
		assertTrue(squirrelMailClient.accept(windowsMailClientVisitor));
		System.out.println();
	}

	@Test
	public void ZimbaMailClientTest() {
		System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
		assertTrue(zimbraMailClient.accept(linuxMailClientVisitor));
		assertTrue(zimbraMailClient.accept(macMailClientVisitor));
		assertTrue(zimbraMailClient.accept(windowsMailClientVisitor));
		System.out.println();
	}

}
