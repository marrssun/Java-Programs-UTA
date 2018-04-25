import javax.swing.*;
import java.util.Scanner;

public class Hw4 {

    public static void main(String[] args) {
        int length,width;
        //creating object of Rectangle
        Rectangle rectangle= new Rectangle();
   Scanner input = new Scanner(System.in);
   String choice1 ="y";
   while (choice1.equalsIgnoreCase("y")) {
        System.out.println("Enter a number from the selection below. ");
        System.out.println("1 - to set the length \n" +
                "2 - to set the width \n" +
                "3 - to get the length\n" +
                "4 - to get the width\n" +
                "5 - to get the perimeter\n" +
                "6 - to get the area\n" +
                "7 - to print the object as string\n" +
                "0 - to quit");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length: "));

                rectangle.setLength(length);

                break;
            case 2:
                width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width: "));
                rectangle.setWidth(width);
                break;
            case 3:
              System.out.println(rectangle.getLength())  ;
                break;
            case 4:
              System.out.println(rectangle.getWidth())  ;
                break;
            case 5:
               System.out.println( rectangle.getPerimeter());
                break;
            case 6:
               System.out.println(rectangle.getArea()) ;
                break;
            case 7:
                System.out.println(rectangle);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("The system cannot process your request. Refer back to the instructions. ");
                break;
        }
        System.out.println("Would you like the system to continue? Y/N : ");
        choice1=input.next();
    }
input.close();
    }
}