package daria;

public class Candy {

	private int weight;
	private String name;
	private String manufacturer;
	private int price;
	private int sugar;
	
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getPrice() {
		return price;
	}
	public int getSugar() {
		return sugar;
	}
public Candy(int weight, String name, String manufacturer, int price, int sugar) {
	this.weight = weight;
	this.name=name;
	this.manufacturer=manufacturer;
	this.price=price;
	this.sugar=sugar;
}
}
