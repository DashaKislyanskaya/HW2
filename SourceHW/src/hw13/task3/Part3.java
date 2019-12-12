package hw13.task3;

public class Part3 {

	public static void main(String[] args) {
		Run count = new Run();

		Runnable run1 = new PlusCounter(count);
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run1);
		Thread thread3 = new Thread(run1);
		thread1.start();
		thread2.start();
		thread3.start();

		Runnable run2 = new PlusCounterSync(count);
		Thread syncThread1 = new Thread(run2);
		Thread syncThread2 = new Thread(run2);
		Thread syncThread3 = new Thread(run2);
		syncThread1.start();
		syncThread2.start();
		syncThread3.start();
	}

}
