package behaviour.observer;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bidder implements Observer {

	private String bidderName;

	@Override
	public void update(final Observer observer, final String productName, final BigDecimal bidAmount) {
		String bid = String.format("R$ %.2f", bidAmount);
		if (observer.toString().equals(bidderName))
			System.out.println("Hello " + bidderName + "! New bid of amount " + bid + " has been placed on "
					+ productName + " by you");
		if (!observer.toString().equals(bidderName))
			System.out.println("Hello " + bidderName + "! New bid of amount " + bid + " has been placed on "
					+ productName + " by " + observer);

	}

	@Override
	public String toString() {
		return bidderName;
	}

}
