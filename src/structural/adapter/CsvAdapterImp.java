package structural.adapter;

public class CsvAdapterImp implements TextFormattable {

	CsvFormattable csvFormatter;

	public CsvAdapterImp(CsvFormattable csvFormatter) {
		super();
		this.csvFormatter = csvFormatter;
	}

	@Override
	public String formatText(String text) {
		String formattedText = csvFormatter.formatCsvText(text);
		return formattedText;
	}

}
