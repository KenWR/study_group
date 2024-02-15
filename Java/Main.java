import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner scanner = new Scanner(is);

		System.out.println("Enter a line of text: ");
		if (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println("You entered: " + line);
		} else {
			System.err.println("No input provided.");
		}
		scanner.close();
	}
}
