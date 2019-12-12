package hw13.task4;

import java.util.Random;

public class Matrix {

	public static void main(String[] args) {
		final int rows = 4;
		final int cols = 100;
		int[][] arr = new int[rows][cols];

		Random random = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = (1 + random.nextInt(100 - 1));
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		long start = System.currentTimeMillis();
		new MaxMatrix("Поток1", arr[0]).start();
		new MaxMatrix("Поток2", arr[1]).start();
		new MaxMatrix("Поток3", arr[2]).start();
		new MaxMatrix("Поток4", arr[3]).start();
		while (MaxMatrix.countEndThread != 4) {
			System.out.print("");
		}
		System.out.println("Максимальное значение " + MaxMatrix.maxValue);
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		System.out.println("Параллельное выполнение " + timeConsumedMillis);

		start = System.currentTimeMillis();
		int maxSec = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] > maxSec)
					maxSec = arr[i][j];
			}
		}
		System.out.println("Максимальное значение " + maxSec);
		finish = System.currentTimeMillis();
		timeConsumedMillis = finish - start;
		System.out.println("Время выполнения " + timeConsumedMillis);
	}

}
