package fileIO_ex;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EOFExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "numbers.dat";
		
		try{
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
			System.out.println("Reading ALL the integers");
			try {
				while(true)
				{
					int anInteger = inputStream.readInt();
					System.out.println(anInteger);
				}
			}
			catch(EOFException e)
			{
				System.out.println("End of reading from file.");
			}
			inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the file " + fileName);
			
		} catch (IOException e1) {
			System.out.println("문제는 input 파일에 있음 ");
		}
		

	}

}
