package structural.facade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structural.facade.facede.OrderFulfillmentController;
import structural.facade.facede.OrderServiceFacade;
import structural.facade.facede.OrderServiceFacadeImpl;

public class OrderFulfillmentControllerTest {

	@Test
	public void orderProductTest() {
		OrderFulfillmentController controller = new OrderFulfillmentController();
		int productId = 999;
		boolean result = true;
		controller.orderProduct(productId);
		assertTrue(result);
	}

	@Test
	public void placeOrderTest() {
		OrderServiceFacade facade = new OrderServiceFacadeImpl();
		int productId = 999;
		boolean result = facade.placeOrder(productId);
		assertTrue(result);
	}

}
