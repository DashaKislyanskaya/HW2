package hw13.task2;


class Spam extends Thread {
	
	int[] mas1;
	String[] mas2;

	public Spam(int[] mas1, String[] mas2) {
		this.mas1 = mas1;
		this.mas2 = mas2;
	}

	public void run() {
		int index = 0;
		while (index < mas1.length) {
			try {
				if (index == mas1.length) {
					index = 0;
				}
				Thread.sleep(mas1[index]);
				System.out.println(mas2[index]);
				index++;

			} catch (InterruptedException x) {
				x.printStackTrace();
			}
		}
	}
}
