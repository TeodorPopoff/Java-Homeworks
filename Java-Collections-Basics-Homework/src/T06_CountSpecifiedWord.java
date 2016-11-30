import java.util.Scanner;


public class T06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String theWord = input.next();
		String[] words = text.split("[\\W]+");
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			if (theWord.equals(words[i])) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
