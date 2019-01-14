package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentPrototypeManager {

	private static Map<String, PrototypeCapableDocument> prototypes = new HashMap<String, PrototypeCapableDocument>();

	static {
		TAndC tAndC = new TAndC();
		tAndC.setVendorName("Vendor Name Placeholder");
		/* Retrieve Terms and Conditions from database/network call/disk I/O here */
		tAndC.setContent("Pease read and accept the terms and conditions...");

		prototypes.put("tandc", tAndC);

		AuthorizedSignatory signatory = new AuthorizedSignatory();
		signatory.setName("Sham Vinicius Fiorin");
		signatory.setDesignation("Operation Head");

		NDAgreement nda = new NDAgreement();
		nda.setVendorName("Vendor Name Placeholder");
		nda.setContent("Please read and accept the NDA");
		nda.setAuthorizedSignatory(signatory);

		prototypes.put("nda", nda);

	}

	public static PrototypeCapableDocument getClonedDocument(final String type) {
		PrototypeCapableDocument clonedDoc = null;
		try {
			PrototypeCapableDocument doc = prototypes.get(type);
			clonedDoc = doc.cloneDocument();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedDoc;
	}

}
