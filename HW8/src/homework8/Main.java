package homework8;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File dir = new File("C:/test");

		System.out.print("String[] list():\n");

		System.out.println(method(dir, "txt"));
		System.out.println(method2(dir, "java", 1));
		System.out.println(method2(dir, "java", 2));
		System.out.println(method2(dir, "java", 3));
	}

	public static int method(File f, String extension) {
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.toString().contains("." + extension)) {
				count++;
			}
			if (file.isDirectory()) {
				count += method(file, extension);
			}
		}
		return count;
	}

	public static int method2(File f, String extension, int depth) {
		int count = 0;
		if (depth > 0) {
			for (File file : f.listFiles()) {
				if (file.toString().contains("." + extension)) {
					count++;
				}
				if (file.isDirectory()) {
					count += method2(file, extension, depth - 1);
				}
			}
		}
		return count;
	}
}
