package behaviour.iterator;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {

	private List<DesignPattern> patternList;
	private DesignPattern designPattern;
	private int position;

	public PatternIteratorImpl(final List<DesignPattern> patternList) {
		this.patternList = patternList;
	}

	@Override
	public DesignPattern nextPattern() {
		System.out.println("Returning pattern at Position: " + position);
		designPattern = patternList.get(position);
		position++;
		return designPattern;
	}

	@Override
	public boolean isLastPattern() {
		if (position < patternList.size())
			return false;
		return true;
	}

}
