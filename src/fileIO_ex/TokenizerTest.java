package fileIO_ex;
import java.io.*;
import java.util.*;

public class TokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string with ',' and ' '");
		String str = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, ", ");
		
		System.out.println("There are " + token.countTokens() + " tokens.");
		System.out.println("The tokens are ...");
		
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		

	}

}
