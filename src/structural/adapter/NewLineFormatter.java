package structural.adapter;

public class NewLineFormatter implements TextFormattable {

	@Override
	public String formatText(final String text) {
		String formattedText = text.replace(".", "\n");
		return formattedText;
	}

}
