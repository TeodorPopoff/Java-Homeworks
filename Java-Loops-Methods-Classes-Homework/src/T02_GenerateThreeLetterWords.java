import java.util.Scanner;


public class T02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		int numberOfChars = inputString.length();
		char[] inputChars= new char[numberOfChars];
		for (int i = 0; i < numberOfChars; i++) {
			inputChars[i] = inputString.charAt(i);
		}
		for (int i1 = 0; i1 < inputChars.length; i1++) {
			for (int i2 = 0; i2 < inputChars.length; i2++) {
				for (int i3 = 0; i3 < inputChars.length; i3++) {
					String word = Character.toString(inputChars[i1]) + Character.toString(inputChars[i2]) + Character.toString(inputChars[i3]);
					System.out.print(word);
					System.out.print(" ");
				}
			}
		}
	}

}
