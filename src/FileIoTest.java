import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class FileIoTest {
public static void main (String [] args) throws IOException{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter file");
	String file = input.nextLine();
	File inputFile = new File (file);
	Scanner fileName = new Scanner(inputFile);
	int sum = 0;
	ArrayList <Integer> Every5th = new ArrayList <Integer>();
	while (fileName.hasNext()) {
		sum += fileName.nextInt();
		Every5th.add(fileName.nextInt());
	}
	fileName.close();
	System.out.println("Sum: " + sum);
	System.out.println("Every 5th Integer");
	for (int j = 0; j < Every5th.size(); j +=5) {
		System.out.println(j);
	}
	
}
}
