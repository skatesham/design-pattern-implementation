package structural.facade.facede;

public class OrderFulfillmentController {

	OrderServiceFacade facade = new OrderServiceFacadeImpl();
	boolean orderFulfilled = false;
	
	public void orderProduct(final int productId) {
		orderFulfilled = facade.placeOrder(productId);
		System.out.println("OrderFulfillmentController: Order fulfillment completed. with "+
		(orderFulfilled ? "SUCCESS!!!" : "FAIL!!!") );
		System.out.println();
	}
	
}
