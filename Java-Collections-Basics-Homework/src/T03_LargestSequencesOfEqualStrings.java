import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class T03_LargestSequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] elements = text.split("[ ]+");
		ArrayList<Integer> counters = new ArrayList<Integer>();
		int counter = 1;
		if (elements.length == 1) {
			counters.add(counter);
		}
		for (int i = 1; i < elements.length; i++) {
			if (elements[i].equals(elements[i-1])) {
				counter++;
			}
			else {
				counter = 1;
			}
			counters.add(counter);
		}
		int maxCounter = Collections.max(counters);
		int indexMaxCounter = counters.indexOf(maxCounter);
		for (int i = 0; i < maxCounter; i++) {
			System.out.print(elements[indexMaxCounter] + " ");
		}
		
	}
}
