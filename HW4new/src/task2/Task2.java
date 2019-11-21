package task2;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int[] massiv = new int[12];
		for (int i = 0; i < massiv.length; i++) {
			massiv[i] = (int) (Math.random() * 100 + 1);
			System.out.print(massiv[i] + " ");
		}
		System.out.println();
		System.out.println("Максимальное число = " + Max(massiv));
	}

	public static int Max(int[] mas) {
		Arrays.sort(mas);
		return mas[mas.length - 1];
	}
}
