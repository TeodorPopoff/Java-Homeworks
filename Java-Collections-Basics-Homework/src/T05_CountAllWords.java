import java.util.Scanner;


public class T05_CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split("[\\W]+");
		System.out.println(words.length);
	}

}
