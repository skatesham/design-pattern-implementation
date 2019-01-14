package creational.builder.product;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class House {

	private String foundation;
	private String structure;
	private String roof;
	private boolean furnished;
	private boolean painted;

}
