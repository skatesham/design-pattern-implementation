package structural.adapter;

public class CsvAdapterImp implements TextFormattable {

	CsvFormattable csvFormatter;

	public CsvAdapterImp(final CsvFormattable csvFormatter) {
		super();
		this.csvFormatter = csvFormatter;
	}

	@Override
	public String formatText(final String text) {
		String formattedText = csvFormatter.formatCsvText(text);
		return formattedText;
	}

}
