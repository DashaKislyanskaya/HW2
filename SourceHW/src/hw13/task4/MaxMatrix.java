package hw13.task4;

public class MaxMatrix extends Thread {
	private static Object a = new Object();
	static int countEndThread;
	static int maxValue;
	private int[] mas;

	MaxMatrix(String name, int[] massiv) {
		super(name);
		mas = massiv;
	}

	public void run() {
		int max = 0;
		for (int i = 0; i < mas.length; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		if (max > maxValue) {
			maxValue = max;
		}
		synchronized (a) {
			countEndThread++;
		}
	}
}
