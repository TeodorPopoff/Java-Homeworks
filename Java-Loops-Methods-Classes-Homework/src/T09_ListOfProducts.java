import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class T09_ListOfProducts {

	public static void main(String[] args) {
		String fileName = "lib/Input2.txt";
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> pricesAsString = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		ArrayList<String> sortedNames = new ArrayList<String>();
		boolean hasLines = true;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
			while (hasLines) {
				String line = fileReader.readLine();
				if (line != null) {
					String name = line.replaceAll("\\s\\d+[.]\\d+", "");
					names.add(name);
					String price = line.replaceAll("[a-z ]+", "");
					pricesAsString.add(price);
					prices.add(Double.parseDouble(price));
				}
				else {
					hasLines = false;
				}
			}
			String[] sorted = new String[names.size()];
			for (int i = 0; i < names.size(); i++) {
				sorted[i] = pricesAsString.get(i) + " " + names.get(i);
			}
			Collections.sort(prices);
			for (int i = 0; i < names.size(); i++) {
				String match = Double.toString(prices.get(i));
				for (int j = 0; j < sorted.length; j++) {
					if (sorted[j].contains(match)) {
						sortedNames.add(names.get(j));
					}
				}
			}
			for (int i = 0; i < sorted.length; i++) {
				System.out.printf("%.2f %s", prices.get(i), sortedNames.get(i));
				System.out.println();
			}
			PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
			for (int j = 0; j < sorted.length; j++) {
				writer.printf("%.2f %s", prices.get(j), sortedNames.get(j));
				writer.println();
			}
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
