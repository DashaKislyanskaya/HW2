package hw13.task2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Part2 {

	public static void main(String[] args) throws InterruptedException {
		int[] mas1 = new int[] { 500, 1000, 1500, 2000, 3000 };
		String[] mas2 = new String[] { "500 миллисекунд", "1000 миллисекунд", "1500 миллисекунд", "2000 миллисекунд",
				"3000 миллисекунд" };
		Spam spam = new Spam(mas1, mas2);
		Thread t = new Thread(spam);
		t.start();
		TimeUnit.SECONDS.sleep(5);
		new Scanner(System.in).nextLine();
		t.interrupt();

	}
}
