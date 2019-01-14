package structural.decorator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structural.decorator.decorators.Glitter;
import structural.decorator.decorators.PaperWrapper;
import structural.decorator.decorators.RibbonBow;

public class FlowerBouquetTest {

	@Test
	public void BouquetDecoratorRunTimeTest() {

		FlowerBouquet orchid = new OrchidBouquet();
		orchid = new RibbonBow(orchid);
		orchid = new PaperWrapper(orchid);
		orchid = new Glitter(orchid);
		orchid.print();

		FlowerBouquet rose = new RoseBouquet();
		rose = new PaperWrapper(rose);
		rose.print();

		assertTrue(true);
	}

}
