package creational.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class TAndC extends PrototypeCapableDocument {

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		TAndC tAndC = null;
		try {
			tAndC = (TAndC) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tAndC;
	}

}
