// demonstrating the use of nested if-else

// prompt the user for an int score
// and convert that score into a letter grade
// rewriting without using the else part

import javax.swing.*;
import java.text.*;

// public - access modifier
public class GradeConverter2
{
    public static void main( String[] arg )
    {
       // declare variables
       int score;
       
       score = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
      
       // create and display the output message
       String message = "";
       
       message = message + "score = " + score;
       

       if ( score >= 90 )
         message = message + "\nGrade = A";
         
       if ( (score >= 80) && (score < 90) ) 
          message = message + "\nGrade = B";
            
       if ( (score >= 70) && ( score < 80 ) )
          message = message + "\nGrade = C";
          
       if ( score < 70 )           
          message = message + "\nGrade = D";
          
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    