package com.dariya;

public class Book {

	private int id;
	private String name;
	private String author;
	private String publishing;
	private int yearPublishing;
	private int numberPages;
	private double price;
	private String bindingType;
	public Book(int id, String name, String author, String publishing, 
				int yearPublishing, int numberPages,
				double price, String bindingType) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishing = publishing;
		this.yearPublishing = yearPublishing;
		this.numberPages = numberPages;
		this.price = price;
		this.bindingType = bindingType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public int getYearPublishing() {
		return yearPublishing;
	}
	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}
	public int getNumberPages() {
		return numberPages;
	}
	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
	
}
