package structural.proxy;

public class ReportGeneratorImpl implements ReportGenerator {

	public ReportGeneratorImpl() {

		System.out.println("ReportGeneratorImpl instance created");
	}

	@Override
	public void displayReportTemplate(final String reportFormat, final int reportEntries) {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateComplexReport(final String reportFormat, final int reportEntries) {
		System.out.println("ReportGeneratorImpl: Generating complex report in " + reportFormat + " format with "
				+ reportEntries + " entries");
	}

	@Override
	public void generateSensitiveReport() {
		System.out.println("ReportGeneratorImpl: Generating sensitive report");
	}

}
