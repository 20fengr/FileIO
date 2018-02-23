import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) throws IOException {
		System.out.println("File");
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();
		int sum = 0;
		Scanner input = new Scanner(System.in);
		String file = new String(input.nextLine());
		File fileName = new File(file);
		Scanner fileScan = new Scanner(fileName);
		while (fileScan.hasNext()) {
			int x = fileScan.nextInt();
			inputs.add(x);
			sum += x;
			if (x % 2 == 0) {
				evens.add(x);
			} else {
				odds.add(x);
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Inputs: " + inputs);
		System.out.println("Evens: " + evens);
		System.out.println("Odds: " + odds);
	}
}