package com.dariya;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Initial(books);
//	List<Book> result = getListAfterYear(books,2010);
//	for(Book b : result)
//		System.out.println(b.getAuthor());
//	List<Book> result1 = getListAuthor(books,"Айн Рэнд");
//	for(Book b : result1)
//		System.out.println(b.getAuthor());
//	List<Book> result2 = getListPublishing(books,"София");
//	for(Book b : result2)
//		System.out.println(b.getAuthor());
	}

	public static void Initial(List<Book> b) {
		b.add(new Book(123, "Невидимка", "Ральф Эллисон", "Penguin", 2001, 624, 450, "Мягкий"));
		b.add(new Book(234, "Джерело", "Айн Рэнд", "Наш Формат", 2016, 752, 130, "Твердый"));
		b.add(new Book(345, "Алхимик", "Пауло Коэльо", "София", 2005, 224, 70, "Твердый"));
		b.add(new Book(456, "Идиот", "Федор Достоевский", "Азбука", 2012, 640, 100, "Твердый"));
	}

	public static List<Book> getListAfterYear(List<Book> b, int year) {
		return b.stream().filter(book -> book.getYearPublishing() >= year).collect(Collectors.toList());
	}

	public static List<Book> getListAuthor(List<Book> b, String author) {
		return b.stream().filter(book -> book.getAuthor() == author).collect(Collectors.toList());
	}

	public static List<Book> getListPublishing(List<Book> b, String publishing) {
		return b.stream().filter(book -> book.getPublishing() == publishing).collect(Collectors.toList());
	}
}
