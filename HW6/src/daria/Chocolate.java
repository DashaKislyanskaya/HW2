package daria;

enum ChocolateType {
	MILK, DARK, WHITE
}

public class Chocolate extends Candy {

	private ChocolateType chocolateType;

	public ChocolateType getChocolateType() {
		return chocolateType;
	}

	public Chocolate(int weight, String name, String manufacturer, int price, int sugar, ChocolateType chocolateType) {
		super(weight, name, manufacturer, price, sugar);
		this.chocolateType = chocolateType;
	}

}
