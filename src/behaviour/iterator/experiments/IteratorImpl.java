package behaviour.iterator.experiments;

import java.util.Iterator;
import java.util.List;

import behaviour.iterator.DesignPattern;

public class IteratorImpl implements Iterator<DesignPattern> {

	private List<DesignPattern> list;
	private int position;

	public IteratorImpl(final List<DesignPattern> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (position < list.size())
			return true;
		return false;
	}

	@Override
	public DesignPattern next() {
		return list.get(position);
	}

}
