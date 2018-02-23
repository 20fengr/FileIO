import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) throws IOException {
		System.out.println("File");
		int sum = 0;
		Scanner input = new Scanner(System.in);
		String file = new String(input.nextLine());
		File fileName = new File(file);
		Scanner fileScan = new Scanner(fileName);
		while (fileScan.hasNext()) {
			sum += fileScan.nextInt();
		}
		System.out.println(sum);
	}
}