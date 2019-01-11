package structural.facade.facede;

import structural.facade.InventoryService;
import structural.facade.PaymentService;
import structural.facade.Product;
import structural.facade.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int productId) {
		boolean orderfulFilled = false;
		Product product = new Product(productId, "Produto Ordered");
		
		if(InventoryService.isAvailable(product)) {
			System.out.println("Product with ID: "+ product.getId()+" is available.");
			boolean paymentConfirmed = PaymentService.makePayment();
			if(paymentConfirmed) {
				System.out.println("Payment confirmed...");
				ShippingService.shipProduct(product);
				System.out.println("Product shipped... Name: "+product.getName());
				orderfulFilled = true;
			}
		}
		
		return orderfulFilled;
	}

}
