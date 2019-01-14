package creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class PrototypeCapableDocument implements Cloneable {

	private String vendorName;
	private String content;

	public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;

}
