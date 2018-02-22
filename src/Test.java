import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("File");
		Scanner input = new Scanner(System.in);
		Scanner fileScan = new Scanner(input.nextLine());
		while (fileScan.hasNext()) {
			System.out.println(fileScan.next());
		}
	}
}
