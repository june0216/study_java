package fileIO_ex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BinaryOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "numbers.dat";
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter nonnegative integers");
			System.out.println("Place a negative number at the " + "end.");
			
			int anInteger;
			do {
				anInteger = sc.nextInt();
				outputStream.writeInt(anInteger);
				
			}while(anInteger >= 0);
			
			System.out.println("Numbers and sential value");
			System.out.println("fileName");
			outputStream.close();
			
		}
		catch(IOException e){
			System.out.println("Problem with output to file" + fileName);
			
		}

	}

}
