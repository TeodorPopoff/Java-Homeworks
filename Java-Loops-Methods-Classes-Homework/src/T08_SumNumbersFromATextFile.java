import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class T08_SumNumbersFromATextFile {

	public static void main(String[] args) {
		String fileName = "lib/Input.txt";
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum = 0;
		boolean hasLines = true;
		try (
			BufferedReader fileReader = new BufferedReader(
				new FileReader(fileName));
		) {
			while (hasLines) {
				String line = fileReader.readLine();
				if (line != null) {
					int number = Integer.parseInt(line);
					numbers.add(number);
				}
				else {
					hasLines = false;
				}
			}
			for (int i = 0; i < numbers.size(); i++) {
				sum += numbers.get(i);
			}
			System.out.println(sum);
		} catch (IOException ioex) {
			System.err.println("Cannot read the file " + fileName);
			ioex.printStackTrace();
		}
	}

}
