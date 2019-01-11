package structural.proxy;

import javax.management.relation.Role;

public class ReportGeneratorImplProxy implements ReportGenerator {

	ReportGenerator reportGeneratorImpl;
	private Role acessRole;

	public ReportGeneratorImplProxy(final Role acessRole) {
		this.acessRole = acessRole;
	}

	@Override
	public void displayReportTemplate(final String reportFormat, final int reportEntries) {
		System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat
				+ " format with " + reportEntries + " entries");

	}

	@Override
	public void generateComplexReport(final String reportFormat, final int reportEntries) {
		if (reportGeneratorImpl == null) {
			reportGeneratorImpl = new ReportGeneratorImpl();
			reportGeneratorImpl.generateComplexReport(reportFormat, reportEntries);
		}

	}

	@Override
	public void generateSensitiveReport() {
		if(acessRole.getRoleName().equals("Manager")) {
			if(reportGeneratorImpl == null) {
				reportGeneratorImpl = new ReportGeneratorImpl();
			} else {
				System.out.println("You are not authorized to acess sensitive reports.");
			}
		}
	}

}
