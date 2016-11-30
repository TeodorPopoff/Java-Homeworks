import java.util.Random;
import java.util.Scanner;


public class T06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hands = input.nextInt();
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
		Random rnd = new Random();
		int[] randomFaces = new int[5];
		int[] randomSuits = new int[5];
		String[] randomCards = new String[5];
		boolean sameCard = false;
		
		for (int h = 0; h < hands; h++) {
			for (int i = 0; i < 5; i++) {
				randomFaces[i] = rnd.nextInt(cardFaces.length);
				randomSuits[i] = rnd.nextInt(suits.length);
				randomCards[i] = cardFaces[randomFaces[i]] + suits[randomSuits[i]];
				for (int j = 0; j < randomCards.length; j++) {
					for (int j2 = 0; j2 < i; j2++) {
						if (randomCards[i].equals(randomCards[j2])) {
							i--;
							sameCard = true;
							break;
						}
					}
				}
				if (sameCard) {
					sameCard = false;
				}
				else {
					System.out.print(randomCards[i] + " ");
				}
			}
			System.out.println();
		}
	}
}
