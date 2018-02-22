import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("File");
		int sum=0;
		Scanner input = new Scanner(System.in);
		Scanner fileScan = new Scanner(input.nextLine());
		while (fileScan.hasNext()) {
			sum+=fileScan.nextInt();
		}
		System.out.println(sum);
	}
}
