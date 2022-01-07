
/**
 * Write a description of class PayrollTest here.
 *
 * @author Shiroya R.
 * @version (a version number or a date)
 */
import java.util.Scanner;   //Needed for Scanner class.

public class PaycheckTest
{
    public static void main(String[] args)
    {
        String EmployeeName;
        int IDnumber;
        double HoursWorked;
        double HourlyPayRate;
        double GrossPay;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Create a payroll object, passing EmployeeName
        // as argument to the constructor.
        
        //Get the employee's name.
        System.out.println("Enter an employee's name: ");
        EmployeeName = keyboard.nextLine();
    
        
        Paycheck pay = new Paycheck(EmployeeName);
        
        //Get the number of hours worked by the employee.
        System.out.println("Enter the amount of hours worked by this employee: ");
        HoursWorked = keyboard.nextDouble();
        pay.setHoursWorked(HoursWorked);
        
        //Get the hourly pay rate of the employee.
        System.out.println("Enter the hourly pay rate for this employee: ");
        HourlyPayRate = keyboard.nextDouble();
        pay.setHourlyPayRate(HourlyPayRate);

        
        //Get the Gross Pay of the employee.
        pay.display();
    }
}
