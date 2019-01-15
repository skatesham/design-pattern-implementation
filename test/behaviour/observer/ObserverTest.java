package behaviour.observer;

import java.math.BigDecimal;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void observerTest() {
		
		Subject product = new Product("Ferrari",  new BigDecimal(100));
		
		Observer bidder1 = new Bidder("Sham Vinicius Fiorin");
		Observer bidder2 = new Bidder("Pedro Jardel Pilla");
		Observer bidder3 = new Bidder("Isabela Trix");
		
		product.registerObserver(bidder1);
		product.registerObserver(bidder2);
		product.registerObserver(bidder3);
		
		product.setBidAmount(bidder3, new BigDecimal(1000));
		product.setBidAmount(bidder1, new BigDecimal(9000));
		product.setBidAmount(bidder2, new BigDecimal(20000));
		product.removeObserver(bidder3);
		
		product.setBidAmount(bidder1, new BigDecimal(100000));
		product.removeObserver(bidder2);
		
	}

}
