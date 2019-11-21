package task4;

public class Task4 {

	public static void main(String[] args) {
		String s ="It seems that you have made a rude mistake";
		System.out.println("Количество слов в строке "+wordCount(s));
	}
	
	public static int wordCount(String a){
	    if (a == null)
	       return 0;
	    return a.split("\\s+").length;
	}
}
