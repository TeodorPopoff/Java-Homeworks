import java.util.Scanner;


public class T03_FullHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'\u2663', '\u2665', '\u2660', '\u2666'};
		int cardFacesNum = cardFaces.length;
		int counter = 0;
		for (int i = 0; i < 13; i++) {
			for (int i1 = 0; i1 < 13; i1++) {
				for (int i2 = 0; i2 < 4; i2++) {
					for (int i3 = 0; i3 < 6; i3++) {
						if (i != i1) {
						System.out.print(cardFaces[i] + suits[(0+i2)%4] + " ");
						System.out.print(cardFaces[i] + suits[(1+i2)%4] + " ");
						System.out.print(cardFaces[i] + suits[(2+i2)%4] + " ");
						
						System.out.print(cardFaces[i1] + suits[(0+i3)%4] + " ");
						System.out.print(cardFaces[i1] + suits[(1+i3)%4] + " ");
						
						System.out.println();
						
						counter++;
						}
					}
				}
			}
		}
		System.out.printf("%d full houses", counter);
	}

}
