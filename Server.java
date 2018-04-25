// Marisol Miramontes, INSY 4306

import java.util.concurrent.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Server
{
	public static void main(String args[])
	{
		ServerSocket serverSocket;
		Socket connection;

		try
		{
			serverSocket = new ServerSocket(8000);
			int clientNo = 1;

			ExecutorService threadExecutor = Executors.newCachedThreadPool();

			while(true)
			{
				connection = serverSocket.accept();
				System.out.println("start thread for client" + clientNo);

				HandleAClient thread = new HandleAClient(connection, clientNo);

				threadExecutor.execute(thread);
				clientNo++;
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}

class HandleAClient implements Runnable 
{
	Scanner input;
	Formatter output;
	Socket connection;
	int clientNo;
	String userInput;
	String reverseStr;
	
	public HandleAClient(Socket connection, int clientNo)
	{
		this.connection = connection;
		this.clientNo = clientNo;
	}
	public void run()
	{
		try
		{
			System.out.println("Waiting for a word. ");
			input =  new Scanner(connection.getInputStream());
			output = new Formatter(connection.getOutputStream());

			while(input.hasNext())
			{
				userInput = input.nextLine();
				System.out.println("Word received from client " + clientNo + " " + userInput);

				String reverseStr= "";
				for(int i = userInput.length() -1; i>=0;)
				{
					reverseStr+=userInput.charAt(i--);
				}
			
				//return string;
				output.format("%s\n", reverseStr);
				output.flush();
			}
			System.out.println("Thread "+ clientNo+ " ended. ");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
