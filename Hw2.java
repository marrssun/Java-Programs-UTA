// Marisol Miramontes


import javax.swing.*;
import java.text.*;

// public - access modifier 
public class Hw2
{
	public static void main( String[] arg)
	{
		// declare primitive variables 
		int year = 0;
		String message = "";
		
		// declaring a constant 
		final int SENTINEL = -99;

		
		// initializing the loop control variables
		while (true)
		{

			year = Integer.parseInt(JOptionPane.showInputDialog( "Enter a year or "  +  SENTINEL + " to stop." ));	
			
			if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 !=0))
				message = message + year +" is a leap year\n";
				else
					message = message + year + " is NOT a leap year\n";
			if (year == SENTINEL)
				break;

				      
       		JOptionPane.showMessageDialog(null, message);	
		}
		
	}
}
