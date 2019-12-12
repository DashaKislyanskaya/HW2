package hw13.task3;

public class PlusCounter implements Runnable {
	Run r;

	public PlusCounter(Run r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			if (r.counter1 == r.counter2)
				System.out.println("Равны");
			else
				System.out.println("Не равны");
			r.counter1++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			r.counter2++;
		}
	}
}
