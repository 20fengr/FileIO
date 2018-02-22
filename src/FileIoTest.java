import java.util.Scanner;
import java.io.*;
public class FileIoTest {
public static void main (String [] arhs) throws IOException{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the name of your data file.");
	Scanner fileName = new Scanner(input.nextLine());
	int sum = 0;
	while (input.hasNext()) {
		sum += input.nextInt();
	}
	System.out.println("Sum: " + sum);
}
}
