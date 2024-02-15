import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("README.md");
		Scanner sc = new Scanner(fr);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
