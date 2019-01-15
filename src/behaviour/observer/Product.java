package behaviour.observer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product implements Subject {

	private ArrayList<Observer> observers;
	private String productName;
	private BigDecimal bidAmount;
	private Observer observer;

	public Product(final String productName, final BigDecimal bidAmount) {
		this.productName = productName;
		this.bidAmount = bidAmount;
		observers = new ArrayList<>();
		System.out.println("*** Auction Begining with: " + productName + ", in: R$ " + bidAmount + " ***");
	}

	@Override
	public void registerObserver(final Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(final Observer observer) {
		observers.remove(observer);
		System.out.println("-----------------" + observer + " has withdrawn from bidding----------------");
		if(observers.size() == 1) {
			String bid = String.format("R$ %.2f", bidAmount);
			System.out.println("Action of "+productName+" finished... Winner "+this.observer + " with "+bid+".");
		}
	}

	@Override
	public void notifyObservers() {
		System.out.println("-----------------New bid placed----------------");
		for (Observer observer : observers) {
			observer.update(this.observer, productName, bidAmount);
		}

	}

	@Override
	public void setBidAmount(final Observer observer, final BigDecimal newBidAmount) {
		int res = bidAmount.compareTo(newBidAmount);
		if (res == -1) {
			this.observer = observer;
			this.bidAmount = newBidAmount;
			this.notifyObservers();
		} else {
			System.out.println("New bid amount cannot be less or equal to current bid amount: R$" + this.bidAmount);
		}

	}

}
