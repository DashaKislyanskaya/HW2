package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Ширина: ");
		int a = in.nextInt();

		System.out.print("Высота: ");
		int b = in.nextInt();
		Pryam(a, b);

	}

	public static void Pryam(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == b - 1)
					System.out.print("+");
				else {
					if(j==0 || j==a-1)
						System.out.print("+");
					else
						System.out.print(" ");
				}
					
			}
			System.out.println();
		}

	}
}
