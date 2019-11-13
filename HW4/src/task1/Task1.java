package task1;

public class Task1 {

	public static void main(String[] args) {
		for (int decimalplaces = 1; decimalplaces <= 5; decimalplaces++) {
			System.out.printf("%." + decimalplaces + "f", Math.PI);
			System.out.print("\n");
		}
	}
}