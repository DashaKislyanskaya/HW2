package lesson11;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		boolean res = false;
		DefaultMyList list = new DefaultMyList();
		list.add("yaya");
		list.add("mama");
		list.add("asdasdasd");
		list.add("asdasdasasd");
		list.remove("asdasdasasd");
		list.add("asdasdasasd");

		for (Object o : list) {
			System.out.println(o.toString());
		}

		System.out.println();

		Iterator<Object> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println();

		ListIterator iter = list.listIterator();
		while (iter.hasNext())
			System.out.println(iter.next());

		System.out.println();

		while (iter.hasPrevious())
			System.out.println(iter.previous());

		System.out.println();

		res = list.contains("mama");
		System.out.println(res);

		res = list.contains("mamamamam");
		System.out.println(res + "\n");

		DefaultMyList list2 = new DefaultMyList();
		list2.add("yaya");
		list2.add("mama");
		res = list.containsAll(list2);
		list2.add("mama");
		System.out.println(list.toString());

		list.clear();
		System.out.print(list.toString());
	}

}
