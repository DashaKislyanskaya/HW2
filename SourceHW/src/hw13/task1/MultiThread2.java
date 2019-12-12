package hw13.task1;

public class MultiThread2 implements Runnable {
	MultiThread2(String name) {
		super();
	}

	public void run() {
		int sum = 0;
		while (sum < 5000) {
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(500);
				sum += 500;
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MultiThread("Поток1").start();
	}
}
