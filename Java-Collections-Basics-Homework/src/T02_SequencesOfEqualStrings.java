import java.util.Scanner;


public class T02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] elements = text.split("[ ]+");
		for (int i = 1; i < elements.length; i++) {
			if (i == 1){
				System.out.print(elements[0] + " ");
			}
			if (elements[i-1].equals(elements[i])) {
			System.out.print(elements[i] + " ");
			}
			else {
				System.out.println();
				System.out.print(elements[i] + " ");
			}
		}
	}
}
