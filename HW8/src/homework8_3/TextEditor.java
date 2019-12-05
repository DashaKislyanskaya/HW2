package homework8_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextEditor {

	final static String EXIT_KEY_WORD = "exit";
	static boolean isAlive = true;
	final static String VOWELS = "AEIOUaeiou";

	public static void writeText(Path path) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (isAlive) {
			String nextLine = sc.nextLine();
			if (!nextLine.equals(EXIT_KEY_WORD)) {
				Files.write(path, nextLine.getBytes(), StandardOpenOption.APPEND);
				Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
			} else {
				isAlive = false;
			}
		}

	}

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Task\\TextEditor.txt");
		List<String> list = new ArrayList();
		writeText(path);
		try (Stream<String> lines = Files.lines(path)) {
			list = lines.collect(Collectors.toList());
		} catch (IOException e) {
		}
		System.out.println("Количество символов в тексте:" + charCount(list));
		System.out.printf("Наибольшее количество гласных в строке \n" + vowelsCount(list));
		System.out.println("Количество слов в файле: " + wordCount(list));

	}

	public static int charCount(List<String> list) {
		int result = 0;
		for (String s : list) {
			result += s.length();
		}
		return result;
	}

	public static int vowelsCount(List<String> list) {
		int index = 0;
		int count = 0;
		for (String s : list) {
			int temp = 0;
			for (char ch : s.toCharArray()) {
				if (VOWELS.indexOf(ch) != -1) {
					temp++;
				}
			}
			if (temp > count) {
				count = temp;
				index = list.indexOf(s) + 1;
			}
		}
		return index;
	}

	public static int wordCount(List<String> list) {
		int word = 0;
		for (String string : list) {
			word += wordCount(string);
		}
		return word;
	}

	public static int wordCount(String stroka) {
		Pattern pat = Pattern.compile("\\s+|\\d|\\W");
		String[] wordArray = pat.split(stroka);
		return wordArray.length;
	}
}