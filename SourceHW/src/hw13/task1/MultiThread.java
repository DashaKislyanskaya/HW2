package hw13.task1;

public class MultiThread extends Thread {
	MultiThread(String name) {
		super(name);
	}

	public void run() {
		int sum = 0;
		while (sum < 5000) {
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(500);
				sum += 500;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new MultiThread("Поток2").start();

	}
}
