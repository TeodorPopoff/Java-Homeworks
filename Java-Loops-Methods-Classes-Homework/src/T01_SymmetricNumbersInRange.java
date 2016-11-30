import java.util.Scanner;


public class T01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startNumber = input.nextInt();
		int endNumber = input.nextInt();
		int currentNumber = startNumber;
		
		while (currentNumber < 10 && currentNumber <= endNumber && currentNumber >= startNumber) {
			System.out.printf("%d ", currentNumber);
			currentNumber++;
		}
		currentNumber = 11;
		while (currentNumber < 100 && currentNumber <= endNumber && currentNumber >= startNumber) {
			System.out.printf("%d ", currentNumber);
			currentNumber += 11;
		}
		currentNumber = 100;
		for (int i = 1; i < 10; i++) {
		currentNumber += 1;
			for (int j = 0; j < 10; j++) {
				if ((currentNumber >= startNumber) && (currentNumber <= endNumber) && (currentNumber >= startNumber)) {
					System.out.printf("%d ", currentNumber);
				}
			currentNumber += 10;
			}
		}
	}

}
