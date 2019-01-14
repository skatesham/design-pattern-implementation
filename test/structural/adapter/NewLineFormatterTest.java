package structural.adapter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NewLineFormatterTest {

	@Test
	public void testFormatTest() throws Exception {

		String testString = "Formmating line 1. Formatting line 2. Formatting line 3.";
		TextFormattable newLineFormatter = new NewLineFormatter();
		String resultString = newLineFormatter.formatText(testString);
		System.out.println(resultString);

		CsvFormattable csvFormatter = new CsvFormatter();
		TextFormattable csvAdapter = new CsvAdapterImp(csvFormatter);
		String resultCsvString = csvAdapter.formatText(testString);
		System.out.println(resultCsvString);

		assertTrue(true);
	}

}
