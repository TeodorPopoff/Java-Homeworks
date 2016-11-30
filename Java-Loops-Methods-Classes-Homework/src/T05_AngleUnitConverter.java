import java.util.ArrayList;
import java.util.Scanner;


public class T05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> queries = new ArrayList<String>();
		for (int i = 0; i <= n; i++) {
			String query = input.nextLine();
			queries.add(query);
		}
		double deg = 0;
		double rad = 0;
		for (int j = 1; j <= n; j++) {
			if (queries.get(j).contains("deg")) {
				deg = Double.parseDouble(queries.get(j).replaceAll("[a-z ]+", ""));
				rad = ConvertDegToRad(deg);
				System.out.printf("%.6f rad", rad);
				System.out.println();
			}
			else {
				rad = Double.parseDouble(queries.get(j).replaceAll("[a-z ]+", ""));
				deg = ConvertRadToDeg(rad);
				System.out.printf("%.6f deg", deg);
				System.out.println();
			}
		}
	}
	public static double ConvertDegToRad(double deg) {
		double rad = deg / 180 * Math.PI;
		return rad;
	}
	public static double ConvertRadToDeg(double rad) {
		double deg = (rad / Math.PI) * 180;
		return deg;
	}
}
