package structural.decorator;

import lombok.Getter;

@Getter
public abstract class FlowerBouquet {

	String description;

	public abstract double cost();

	public void print() {
		System.out.println(this.getDescription() + ", $ " + this.cost());
	}
}
