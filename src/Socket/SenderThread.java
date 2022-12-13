import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderThread extends Thread{
	Socket socket = null;
	public SenderThread(Socket socket){
		this.socket = socket;
	}
	
	
	public void run() {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			String strIn;
			
			while(true)
			{
				strIn = in.nextLine();
				if(strIn.equalsIgnoreCase("bye"))break;
				out.println(strIn);
				out.flush();
				
			}
		}
		catch(IOException e)
		{
			System.out.println("End of Chatting");
			
		}
		try {
			socket.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
