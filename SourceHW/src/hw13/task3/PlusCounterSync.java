package hw13.task3;

public class PlusCounterSync implements Runnable {
	Run r;

	public PlusCounterSync(Run r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			synchronized (r) {
				if (r.counter1 == r.counter2)
					System.out.println("Равны");
				else
					System.out.println("Не равны");
				r.counter1++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				r.counter2++;
			}
		}
	}
}
