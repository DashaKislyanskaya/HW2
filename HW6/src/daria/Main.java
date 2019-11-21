package daria;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CandyBox box = new CandyBox();
		Init(box);
		box.SortBySugar();
		System.out.println(box.AllSugarInBox());
		System.out.println(box.AllWeightInBox());
		box.RemoveCandy("Сочный центр");
		System.out.println(box.AllSugarInBox());
		System.out.println(box.AllWeightInBox());
		List<Candy> result = box.SugarAvarage(10,12);
		System.out.println(result.get(0).getName()+"\n"+result.get(1).getName()+"\n"+result.get(2).getName());
	}
	
	public static void Init (CandyBox c) {
		c.AddCandy(new Chocolate(12, "Мак", "Roshen", 2, 18, ChocolateType.DARK));
		c.AddCandy(new Chocolate(27, "Киндер", "Ferrero", 23, 10, ChocolateType.MILK));
		c.AddCandy(new Chocolate(19, "Милка", "Kraft Foods", 9, 12, ChocolateType.WHITE));
		c.AddCandy(new Jelly(15, "Сочный центр", "Storck", 1, 2));
		c.AddCandy(new Jelly(12, "Пчелки", "Roshen", 2, 9));
		c.AddCandy(new Jelly(13, "Haribo", "Haribo", 8, 7));
		c.AddCandy(new Lollipop(25, "ЧупаЧупс", "Perfetti", 15, 11));
		c.AddCandy(new Lollipop(10, "Малибу", "Roshen", 3, 20));
		c.AddCandy(new Lollipop(25, "Кислинка", "Roshen", 4, 5));
	}
}
