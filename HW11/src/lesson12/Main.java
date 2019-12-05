package lesson12;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(1000000);
		LinkedList<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < 100; i++) {
			// array.add(0, i);
			// array.add((int)i/2, i);
			// array.add(i, i);
			// linked.add(0, i);
			// linked.add((int)i/2, i);
			linked.add(i, i);
		}
		Date startLinked = new Date();
		for (int i = 99; i > 0; i--) {
			// array.remove(0);
			// array.remove((int)i/2);
			// array.remove(i);
			// linked.remove(0);
			linked.remove((int) i / 2);
			// linked.remove(i);
		}
		Date finishLinked = new Date();
		long linkedTime = finishLinked.getTime() - startLinked.getTime();
		System.out.print(linkedTime);
	}
}
