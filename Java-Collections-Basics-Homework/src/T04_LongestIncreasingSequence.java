import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class T04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numbersLine = input.nextLine();
		String[] numbersAsString = numbersLine.split("[ ]+");
		int n = numbersAsString.length;
		int[] numbers = new int[n];
		ArrayList<String> sequences = new ArrayList<String>();
		ArrayList<Integer> counters = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i]);
		}
		sequences.add(Integer.toString(numbers[0]) + " ");
		counters.add(1);
		int counter = 1;
		for (int i = 1; i < n; i++) {
			if (numbers[i] > numbers[i-1]) {
				sequences.set(sequences.size() - 1, sequences.get(sequences.size() - 1) + numbers[i] + " ");
				counter = counters.get(counters.size() - 1) + 1;
				counters.set(counters.size() - 1, counter);
			}
			else {
				sequences.add(Integer.toString(numbers[i]) + " ");
				counter = 1;
				counters.add(counter);
			}
		}
		for (int i = 0; i < sequences.size(); i++) {
			System.out.println(sequences.get(i));
		}
//		for (int i = 0; i < counters.size(); i++) {
//			System.out.println(counters.get(i));
//		}
		int maxCounter = Collections.max(counters);
		int indexMaxCounter = counters.indexOf(maxCounter);
		System.out.printf("Longest: %s", sequences.get(indexMaxCounter));
	}

}
