// Marisol Miramontes, INSY 4306

import java.io.*;
import java.net.*;
import java.util.*;

public class Client
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String reverseStr;
		String userInput;

		Scanner serverinput;
		Formatter output;
		Socket connection;

		while (true)
		{
			try
			{
				connection = new Socket("localhost", 8000);
				serverinput = new Scanner(connection.getInputStream());
				output = new Formatter(connection.getOutputStream());

				System.out.println("Enter a word to see spooky magic or enter 'quit' to exit the fun. ");
				userInput = input.nextLine();

				while(!userInput.equals("quit"))
				{
					output.format("%s\n", userInput);
					output.flush();
					// client waits
					reverseStr = serverinput.nextLine();
					//print it out now
					System.out.println("Abracadabra! Your word has been reversed! " + reverseStr);
					userInput = input.nextLine();
				}
				System.exit(0);
			}

			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
	}
}