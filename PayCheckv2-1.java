
/**
 * This class will calculate the netpay of a paycheck given all the details by the user.
 * At the end a string method is used to display all the information given by the user
 * and also the netpay which is calculated by this code.
 * A method is used to set every initial numeric field to 0
 * and the initial string fields to "unknown".
 * @author R. Shiroya
 * @version 02-07-2020
 */


public class PayCheck
{
    // declaring all the variables including strings, int, and douuble values.
   private String firstName;    // String to store the first name of the user.
   private String lastName;     // String to store the last name of the user.   
   private double hourlyRate;   // double to store the hourly rate of the user.
   private int hours;   // int to store the hours worked by the user.
   private double netPay;   // double to store the calculate net pay of the user.
   private double grossPay;     // double to store the calculated grossPay.

   // declaring the constants.
   private final double FEDERAL_TAX_RATE;   // constant to store the federal tax rate.
   private final double STATE_TAX_RATE;     // constant to store the state tax rate.
   private final double FICA_RATE;  // constant to stre the fica rate.
   
   /**This default or no-args constructor allows the construction
   * of PayCheck when the details are not known yet. 
   * The main aim of this constructor is to set the final value of the constants respectively,
   * and the initial value
   * of the variables double and int to 0, and string to "unknown".
   */
   public PayCheck()
   {
       // assigning the string to unknown.
       firstName = "unknown";
       lastName = "unknown";
       //assigning the double and int to 0
       hourlyRate = 0;
       hours = 0;
       //assigning the constants their values.
       FEDERAL_TAX_RATE = 0.15;
       STATE_TAX_RATE = 0.09;
       FICA_RATE = 0.07;
       
   }
   /**This constructor allows the user of this class to create
   * an instance of a PayCheck when they know the first name, last name, 
   * hour rate, hours, federal tax, state tax, and fica rate.
   * @param String, first name of the user
   * @param String, last name of the user
   * @param double, hourly rate of the user
   * @param int, number of hours worked
   * @param double, federal tax rate
   * @param double, state tax rate
   * @param double, fica rate
   */
   public PayCheck(String fName, String lName, double hrRate, int hrs, double fedTax, double stTax, double fcRate)
   {
       firstName = fName;
       lastName = lName;
       hourlyRate = hrRate;
       hours = hrs;
       FEDERAL_TAX_RATE = fedTax;
       STATE_TAX_RATE = stTax;
       FICA_RATE = fcRate;
   }
    /** This set method allows the user of this class to change the first name of 
    * an existing PayCheck object
    * @param String, the new first name of the user.
    */
   public void setFirstName(String nameF)
   {
        firstName = nameF;
   }
   /** This set method allows the user of this class to change the last name of 
    * an existing PayCheck object
    * @param String, the new last name of the user.
    */
   public void setLastName(String nameL)
   {
        lastName = nameL;
   }
   /** This set method allows the user of this class to change the hourly rate of 
    * an existing PayCheck object
    * @param double, the new hourly rate of the user.
    */
   public void setHourlyRate(double rateHourly)
   {
        hourlyRate = rateHourly;
   }
   /** This set method allows the user of this class to change the hours worked of 
    * an existing PayCheck object
    * @param double, the new number of hours worked by the user.
    */
   public void setHours(int hoursWorked)
   {
        hours = hoursWorked;
   }
   /** This get method returns the value of the first name of the user.
   * @return String, the first name of the user. 
   */
   public String getFirstName()
   {
        return firstName;
   }
   /** This get method returns the last name of the user.
   * @return String, the last name of the user.
   */
   public String getLastName()
   {
        return lastName;
   }
   /**This get method returns the hourly rate of the user.
   *@return double, the hourly rate of the user.
   */
   public double getHourlyRate()
   {
        return hourlyRate;
   }
   /** This get method returns the number of hours of the user.
   * @return int, the number of hours worked by the user.
   */
   public int getHours()
   {
        return hours;
   }
   /** The toString method creates a string which returns the value of PayCheck.
   * It returns and prints the information given by the user and calculated by the code.
   * values such as first name, last name, hourly rate, number of hours are the 
   * value given by the user. netPay is the value calculated by the user.
   */
   public String toString()
   {
       if (hours > 40)  // a simple if else statement to calculate the overtime. If the hours exceed 40 the payrate increase by 1.5.
            {
                double extraHours = hours - 40;     //a double variavble to calculate the extra hours worked.
                grossPay = ( 1.5 * hourlyRate * extraHours) + (40 * hourlyRate);        // to caclulate the grosspay including extra hours worked.

            }
       else
            grossPay = hours * hourlyRate;      // if no overtime, then no extra pay so the grosspay remains the same.
            
       double tax = (grossPay * FEDERAL_TAX_RATE) + (grossPay * STATE_TAX_RATE) + (grossPay * FICA_RATE);       // a double variable to calculate the total tax.
       netPay = grossPay - tax;     // netpay is grosspay - tax.
       
       return       // returning all the fields 
       "First Name: " + firstName + "\n" 
       + "Last Name: " + lastName + "\n"
       + "Hourly Rate: " + hourlyRate + "\n"
       + "Hours Worked: " + hours + "\n"
       + "Gross Pay: " + grossPay + "\n"
       + "Tax: " + tax + "\n" 
       + "Net Pay: " + netPay ; 
       
   }

} // end of class definition.