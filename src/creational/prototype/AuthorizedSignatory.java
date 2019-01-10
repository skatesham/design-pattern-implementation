package creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class AuthorizedSignatory implements Cloneable {

	private String name;
	private String designation;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
