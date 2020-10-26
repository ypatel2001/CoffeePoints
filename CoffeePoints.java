//Author: Yash Patel
//Purpose: To create a program that allows a user to calculate their reward points from  
//the amount of cups they purchased. 

//import the JOptionPane class
import javax.swing.JOptionPane ; 
// create a class with the file name
public class CoffeePoints
{
   public static void main (String [ ]args)
      {
      //defining variables 
      
      //string variable to hold the string input by the user
      String cupsString = "" ;
      //int variable to hold the parsed and converted string input
      int cupsInt = 0 ;
      // double variable to calculate and hold the amount of points the user has
      double points = 0;
      
      //pane with greeting message      
      JOptionPane.showMessageDialog(null, "Hello, please enter the number of cups of coffee you have purchased.");
      //making the user input from the pane equal the string variable defined above
      cupsString = JOptionPane.showInputDialog("Enter the number of cups here (enter whole numbers please): ");
      
      //parsing the string variable that was just assigned the string input into the integer variable
      cupsInt = Integer.parseInt(cupsString);
      
      //beginning of the case statements 
      switch (cupsInt)//defining what variable to draw cases from
      {
         //what to do in case of a 0
         case 0:
            points = cupsInt * 0;
            JOptionPane.showMessageDialog(null,
            String.format("You have %,.1f points. Sorry!",points));
            break;
         //what to do in case of a 1
         case 1:
            points = cupsInt * 4;
            JOptionPane.showMessageDialog(null,
            String.format("You have %,.1f points. Enjoy!",points));
            break;
         //what to do in case of a 2
         case 2:
            points = cupsInt * 4.5;
            JOptionPane.showMessageDialog(null,
            String.format("You have %,.1f points. Enjoy!",points));
            break;
         //what to do in case of a 3
         case 3:
            points = cupsInt * 5;
            JOptionPane.showMessageDialog(null,
            String.format("You have %,.1f points. Enjoy!",points));
            break;
         //default statement with an if and else statement to direct the code properly
         default:
            //what to do in case the number of cups is equal to or greater than 4
            if (cupsInt>=4)
            {
               points = cupsInt * 5.7;
               JOptionPane.showMessageDialog(null,
               String.format("You have %,.1f points. Enjoy!",points));
               break;
            }
            //what to do if the if statement and all defined cases are not met (to handle negative numbers etc.)
            else
            {
               JOptionPane.showMessageDialog(null,"Sorry, please enter a valid amount of cups.");
               break;
            }
                  }
         //exits JOptionPane 
         System.exit(0);
      }

}