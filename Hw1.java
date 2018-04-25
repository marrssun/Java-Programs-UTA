// Marisol Miramontes

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Hw1
{
    public static void main( String[] arg )
    {
      // declare primitive variables
      
      int perage1, perage2;
      String firstname1, lastname1, firstname2, lastname2;

      // request FName, LName, & Age of Person 1
      firstname1 = JOptionPane.showInputDialog( "Enter First Name of Person 1: ");
      lastname1 = JOptionPane.showInputDialog("Enter Last Name of Person 1: ");
      perage1 = Integer.parseInt(JOptionPane.showInputDialog("Enter AGE of Person 1: "));


      // request FName, LName, & Age of Person 2
      firstname2 = JOptionPane.showInputDialog("Enter First Name of Person 2: ");
      lastname2 = JOptionPane.showInputDialog("Enter Last Name of Person2: ");
      perage2= Integer.parseInt(JOptionPane.showInputDialog("Enter AGE of Person 2"));

      
      // create and display output messages
      String message = "";

      message = message + "First Person: " + lastname1 + ", " + firstname1 +" "+ "("+perage1+")";
      message = message + "\n" + "Second Person: " + lastname2 + ", " + firstname2 +" "+ "("+perage2+")";


      if (perage1 > perage2)
        message = message + "\n" + lastname1+ " " + "is older than"+ " " + lastname2; 

      if (perage1 < perage2)
        message = message + "\n" + lastname1+ " " + "is youger than" + " " + lastname2;

      if (perage1 == perage2)
        message = message + "\n" +lastname1 + " " + "is of same age as" + " " +lastname2;


       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}