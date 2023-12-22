/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */

package lab6.cst8284;

//THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//HourlyProgrammer.java
//HourlyProgrammer class extends Programmer.

/**
 * The HourlyProgrammer class extends Programmer.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see HourlyProgrammer
 *
 */

public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

//constructor  				why we need month and year? due invoice class has.
	/**
	 * This is the constructor of the HourlyProgrammer class that sets the instance
	 * variables of the superclass and the wage and hours of the hourly programmer.
	 * 
	 * @param firstName            the first name of the hourly programmer.
	 * @param lastName             the last name of the hourly programmer.
	 * @param socialSecurityNumber the social security number of the hourly
	 *                             programmer.
	 * @param month                the month that the hourly programmer was hired.
	 * @param year                 the year that the hourly programmer was hired.
	 * @param wage                 the wage per hour of the hourly programmer.
	 * @param hours                the hours worked per week of the hourly
	 *                             programmer.
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber); // 原先有问题！！only super(-,-,-,month,year) inheritable
		this.wage = wage;
		this.hours = hours;
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
	}

//set wage
	/**
	 * This method sets the wage per hour of the hourly programmer.
	 * 
	 * @param wage the wage per hour of the hourly programmer.
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

//return wage
	/**
	 * This method returns the wage per hour of the hourly programmer.
	 * 
	 * @return the wage per hour of the hourly programmer.
	 */
	public double getWage() {
		return wage;
	}

//set hours worked
	/**
	 * This method sets the hours worked per week of the hourly programmer. The
	 * hours worked must be non-negative and no greater than 168.
	 * 
	 * @param hours the hours worked per week of the hourly programmer.
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

//return hours worked
	/**
	 * This method returns the hours worked per week of the hourly programmer.
	 * 
	 * @return the hours worked per week of the hourly programmer.
	 */
	public double getHours() {
		return hours;
	}

//calculate earnings; override abstract method getPaymentAmount(NOT earnings!!!!) in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	/**
	 * This method calculates the payment amount of the hourly programmer based on
	 * the hours worked per week and the wage per hour. It overrides the
	 * getPaymentAmount() method of the superclass.
	 * 
	 * @return the payment amount of the hourly programmer.
	 */
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

//return String representation of HourlyProgrammer object  why it can also be override????            

	/**
	 * Returns a string representation of the HourlyProgrammer object, including
	 * their first and last name, social security number,month and year of birth,
	 * hourly wage, hours worked, and weekly earnings.
	 * 
	 * @return a string representation of the HourlyProgrammer object
	 */
	@Override
	public String toString() {

		return String.format("%s: %s \n%s: $%,.2f; %s: %,.2f", "hourly Programmer", super.toString(), "hourly wage:",
				getWage(), "hours worked:", getHours());
	}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
//INSERT YOUR CODE
//END

}
