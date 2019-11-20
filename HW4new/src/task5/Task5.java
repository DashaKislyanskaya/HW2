package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
		String[] s = { "It", "seems", "that", "you", "have", "made", "a" , "tar", "valera"};
		System.out.println("Количество слов в строке");
		String[] result = GetMoreThenThree(s);
		for (int i = 0; i < result.length; i++) {
			if (!(result[i] == null))
				System.out.print(result[i] + " ");
		}
	}

	public static String[] GetMoreThenThree(String[] a) {
		int index = 0;
		String[] massiv = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			Pattern pattern = Pattern.compile(".{4,}");
			Matcher matcher = pattern.matcher(a[i]);
			boolean found = matcher.matches();
			if (found) {
				massiv[index] = a[i];
				index++;
			} else
				continue;
		}
		return massiv;
	}
}
