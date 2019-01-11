package structural.adapter;

public class CsvFormatter implements CsvFormattable {

	@Override
	public String formatCsvText(final String text) {
		String formattedText = text.replace(".", ",");
		return formattedText;
	}

}
