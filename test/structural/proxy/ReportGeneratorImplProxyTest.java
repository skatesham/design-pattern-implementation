package structural.proxy;

import java.util.Arrays;

import javax.management.relation.Role;

import org.junit.Test;

public class ReportGeneratorImplProxyTest {

	@Test
	public void generateReportTest() {
		Role acessRole = new Role("Manager", Arrays.asList()) ;
		ReportGenerator proxy = new ReportGeneratorImplProxy(acessRole);
		proxy.displayReportTemplate("PDF", 150);
		proxy.generateComplexReport("PDF", 150);
		proxy.generateSensitiveReport();
		
		acessRole = new Role("Admin", Arrays.asList()) ;
		proxy = new ReportGeneratorImplProxy(acessRole);
		proxy.generateSensitiveReport();
	}

}
