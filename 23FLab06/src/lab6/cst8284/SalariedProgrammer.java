/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */

package lab6.cst8284;

//THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.
/**
 * The HourlyProgrammer class extends Programmer.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see SalariedProgrammer
 *
 */
public class SalariedProgrammer extends Programmer {
	private double weeklySalary;

//constructor
	/**
	 * Constructs a SalariedProgrammer object with the given attributes
	 * 
	 * @param firstName            the first name of the programmer
	 * @param lastName             the last name of the programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param month                the month of birth of the programmer
	 * @param year                 the year of birth of the programmer
	 * @param weeklySalary         the weekly salary of the programmer
	 * @throws IllegalArgumentException if the weekly salary is less than 0.0
	 */

	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//set salary
	/**
	 * Sets the weekly salary of the programmer
	 * 
	 * @param weeklySalary the weekly salary of the programmer
	 * @throws IllegalArgumentException if the weekly salary is less than 0.0
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//return salary
	/**
	 * Returns the weekly salary of the programmer
	 * 
	 * @return the weekly salary of the programmer
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	/**
	 * Calculates and returns the payment amount for the invoice.
	 * 
	 * @return the payment amount for the invoice
	 */
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

//return String representation of SalariedProgrammer object
	/**
	 * Returns the string representation of the Invoice object.
	 * 
	 * @return the string representation of the Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s \n%s: $%,.2f", "salaried Programmer", super.toString(), "weekly salary",
				getWeeklySalary());
	}

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
//INSERT YOUR CODE
//END
}
