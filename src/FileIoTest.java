import java.util.Scanner;
import java.io.*;
public class FileIoTest {
public static void main (String [] args) throws IOException{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter file");
	String file = input.nextLine();
	File inputFile = new File (file);
	Scanner fileName = new Scanner(inputFile);
	int sum = 0;
	while (fileName.hasNext()) {
		sum += fileName.nextInt();
	}
	fileName.close();
	System.out.println("Sum: " + sum);
}
}
