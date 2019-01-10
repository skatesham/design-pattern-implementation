package creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class NDAgreement extends PrototypeCapableDocument {

	private AuthorizedSignatory authorizedSignatory;
	
	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {

		NDAgreement ndAgreement = (NDAgreement) super.clone();
		AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) ndAgreement.getAuthorizedSignatory().clone();
		ndAgreement.setAuthorizedSignatory(clonedAuthorizedSignatory);
		return ndAgreement;

	}

}
