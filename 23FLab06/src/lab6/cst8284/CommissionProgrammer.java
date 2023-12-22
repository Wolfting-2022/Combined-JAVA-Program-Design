/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */
package lab6.cst8284;

//THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java

/**
 * The CommissionProgrammer class extends Programmer.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see CommissionProgrammer
 *
 */

public class CommissionProgrammer extends Programmer {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

//constructor
	/**
	 * Constructor for CommissionProgrammer class
	 * 
	 * @param firstName            the first name of the CommissionProgrammer
	 * @param lastName             the last name of the CommissionProgrammer
	 * @param socialSecurityNumber the social security number of the
	 *                             CommissionProgrammer
	 * @param month                the month of birth of the CommissionProgrammer
	 * @param year                 the year of birth of the CommissionProgrammer
	 * @param grossSales           the gross weekly sales of the
	 *                             CommissionProgrammer
	 * @param commissionRate       the commission rate of the CommissionProgrammer
	 * 
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

//set gross sales amount on the creation of apps
	/**
	 * Sets the gross sales amount of the CommissionProgrammer
	 * 
	 * @param grossSales the gross sales amount to be set
	 * @throws IllegalArgumentException if the grossSales is less than 0.0
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

//return gross sales amount
	/**
	 * Returns the gross sales amount of the CommissionProgrammer
	 * 
	 * @return the gross sales amount of the CommissionProgrammer
	 */
	public double getGrossSales() {
		return grossSales;
	}

//set commission rate
	/**
	 * Sets the commission rate of the CommissionProgrammer
	 * 
	 * @param commissionRate the commission rate to be set
	 *
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

//return commission rate
	/**
	 * Returns the commission rate of the CommissionProgrammer
	 * 
	 * @return the commission rate of the CommissionProgrammer
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	/**
	 * Calculates the payment amount of the CommissionProgrammer based on the
	 * commission rate and gross sales amount
	 * 
	 * @return the payment amount of the CommissionProgrammer
	 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}

//return String representation of CommissionProgrammer object
	/**
	 * Returns a string representation of the CommissionProgrammer object, including
	 * their first and last name, social security number, month and year of birth,
	 * gross sales amount, commission rate, and weekly earnings.
	 * 
	 * @return a string representation of the CommissionProgrammer object
	 */
	// @Override
	public String toString() {
		return String.format("%s: %s \n%s: $%,.2f; %s %,.2f", "commission Programmer", super.toString(), "gross sales",
				getGrossSales(), "commission Rate:", getCommissionRate());
	}

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
//INSERT YOUR CODE
//END

}
