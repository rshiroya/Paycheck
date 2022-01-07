import java.util.Scanner; // to import the Scanner utility to read the user's input.
/**
 * This class is the driver class which will enable the user to enter their firstname, lastname, hourlyrate, hourworked.
 * And then from the help of the PayCheck class the program will calculate the netpay deducting all the taxes.
 * Every detail will be displayed to the user after entering all the values asked.
 * The code will also validate the number of hours worked and rate of pay to not exceed the certain limit.
 * @author R. Shiroya
 * @version 02-08-2020
 */


public class PayCheckDriver
{
    public static void main(String[] args)
    {
      // declaring local variables in main.
       char goAgain = 'y';  // for while loop
       PayCheck pay = new PayCheck(); // to create a new reference object of Paycheck class  
       Scanner keyboard = new Scanner(System.in); // Scanner object named keyboard created
       
       // a while loop to make the code run again and again unless asked to.
       while (goAgain == 'y') // this loop will run until the value of goAgain is changed to something other than y.
       {
          // print out the options for user
          System.out.println("Hello! This is a paycheck calculator. Please select one of the option.");
          System.out.println("1.Enter Data");
          System.out.println("2.Quit");
          System.out.print("Enter choice (1 or 2): ");
          int choice = keyboard.nextInt(); // scan the option chosen by the user

          if (choice == 1) // if choice is 1 the following will run
          {
             System.out.print("Enter your first name:");
             String first = keyboard.next(); // the string first will be assigned to the value inputted by the user.
             pay.setFirstName(first); // set the First name to be the string first which is the user's input.
             System.out.print("Enter last name:");
             String last = keyboard.next(); // the string last will be assigned to the value inputted by the user.
             pay.setLastName(last); // set the last name to be the string last which is the user's input.
             char validateRate = 'y'; // set the default value to y.
             while (validateRate == 'y') // to validate the hourly rate to be set between 5 and 100
             {
                System.out.print("Enter Hourly Rate of pay:");
                double rate = keyboard.nextDouble(); // the double rate will be assigned to the value inputted by the user.
                if (rate < 5 || rate > 100) // if rate is less than 5 or greater than 100 then the following code will run.
                {
                   System.out.print("Please enter value of rate between 5 and 100: \n");
                }
                else 
                {
                   validateRate = 'n';  // Now, n means that the if else loop is stopped. and the set that value to be actual value.
                   pay.setHourlyRate(rate);
                }
             } 
             char validateHours = 'y';  // set the default value to y
             while (validateHours == 'y') // if the value is y the following code is executed.
             {
                System.out.print("Enter Hours worked:");
                int hours = keyboard.nextInt(); // the int hours is assigned to the value inputted by the user.
                if (hours < 5 || hours > 80) // if the hours is less than 5 or greater than 80 the following code will be executed
                {
                   System.out.print("Please enter number of hours between 5 and 80: \n");
                }
                else 
                {
                   validateHours = 'n'; // to stop the code and assigned the givven value to hours
                   pay.setHours(hours);
                }
                
               
             }
             
             System.out.println("");
             System.out.println(pay); // to print all the values stored in the object
             System.out.println("\n----------x----------x----------\n");
            }  
          else if (choice == 2 )  // if the choice is 2 , the following code will be executed.
          {
             goAgain = 'n'; // to stop the code and print the following message.
             System.out.print("Thank You. Please Come Again.");

          }
          
          else
          {
             System.out.print("Wrong Value. Press 1 to enter the details to calculate the paycheck or 2 to exit the code: ");
          }
       }  
    }
}       // end of class definition

