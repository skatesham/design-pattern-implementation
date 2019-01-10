package creational.prototype;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DocumentPrototypeManagerTest {

	@Test
	public void getCloneDocumentTest() {
		PrototypeCapableDocument tAndC = DocumentPrototypeManager.getClonedDocument("tandc");
		tAndC.setVendorName("Susete Anselmo");
		System.out.println(tAndC);
		
		PrototypeCapableDocument nda = DocumentPrototypeManager.getClonedDocument("nda");
		nda.setVendorName("Pedro Jardel Pilla");
		System.out.println(nda);
		
		assertTrue(true);
		
	}
	
	
}
