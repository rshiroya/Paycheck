
/**
 * Write a description of class Payroll here.
 *
 * @author Shiroya R.
 * @version (a version number or a date)
 */
import java.util.Scanner;   //Needed for scanner class.

public class Paycheck
{
    private String EmployeeName;
    
    private double HourlyPayRate;
    private double HoursWorked;
    private double GrossPay;
    
    /**
        Constructor
        @param Name The name to store in EmployeeName.
        
    */
    public Paycheck(String Name)
    {
        EmployeeName = Name;
        Name = "unknown";
        HourlyPayRate = 0;
        GrossPay = 0;
        HoursWorked = 0;
    }
    public double calculatePaycheck(double HourlyPayRate, double HoursWorked)
    {
    if ( HoursWorked > 40 )
    {
        double extraHours = HoursWorked - 40;
        GrossPay = ( 1.5 * HourlyPayRate * extraHours ) + ( 40 * HourlyPayRate ) ;
    }
    else
        GrossPay = HourlyPayRate * HoursWorked;
        return GrossPay;
    }
    public String getEmployeeName()
    {
        return EmployeeName;
    }
    
    public void setHourlyPayRate(double HourlyRate)
    {
        HourlyPayRate = HourlyRate;
    }
    public double getHourlyPayRate()
    {
        return HourlyPayRate;
    }
    public void setHoursWorked(double hoursWorked)
    {
        HoursWorked = hoursWorked;
    }
    public double getHoursWorked()
    {
        return HoursWorked;
    }
    public double getGrossPay()
    {
        return GrossPay;
    }
    public void display()

    {
    
        System.out.println("\n=========================");
        
        System.out.println("Employee PayCheck Details");
        
        System.out.println("=========================");
        
        System.out.println( "\nEmployee: " + getEmployeeName() );
        
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.print("Rate Of Pay: " + getHourlyPayRate());
        
        System.out.println( "\nGross Pay: " + calculatePaycheck(HourlyPayRate, HoursWorked) );
    }
}
