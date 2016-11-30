import java.util.Scanner;
import java.util.regex.*;

public class T07_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String theWord = input.next();
		String[] words = text.split("[\\W]+");
		int theWordLenght = theWord.length();
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(theWord)) {
				for (int j = 0; j < words[i].length(); j++) {
					if (j <= (words[i].length() - theWordLenght) && words[i].substring(j, j + theWordLenght).contains(theWord)) {
						counter++;
					}
					
				}
			}	
		}
		System.out.println(counter);
	}
}
