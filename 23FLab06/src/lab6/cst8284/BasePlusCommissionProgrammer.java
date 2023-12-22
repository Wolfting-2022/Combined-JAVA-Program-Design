/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */
package lab6.cst8284;

//THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//BasePlusCommissionProgrammer.java

/**
 * The BasePlusCommissionProgrammer class extends CommissionProgrammer.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see BasePlusCommissionProgrammer
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {

	private double baseSalary; // base salary per week

//constructor
	/**
	 * Constructor for BasePlusCommissionProgrammer class.
	 * 
	 * @param firstName            the first name of the programmer.
	 * @param lastName             the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month                the month the programmer was hired.
	 * @param year                 the year the programmer was hired.
	 * @param grossSales           the total gross sales made by the programmer.
	 * @param commissionRate       the commission rate of the programmer.
	 * @param baseSalary           the base salary per week of the programmer.
	 * @throws IllegalArgumentException if the baseSalary is less than 0.0.
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month,
			int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate); // why must has month
																									// and year

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

// set base salary
	/**
	 * Sets the base salary per week of the programmer.
	 * 
	 * @param baseSalary the new base salary per week of the programmer.
	 * @throws IllegalArgumentException if the baseSalary is less than 0.0.
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

//return base salary
	/**
	 * Gets the base salary per week of the programmer.
	 * 
	 * @return the base salary per week of the programmer.
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	/**
	 * Calculates the payment amount of the programmer including the base salary per
	 * week. Overrides the getPaymentAmount() method in CommissionProgrammer.
	 * 
	 * @return the payment amount of the programmer.
	 */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

//return String representation of BasePlusCommissionProgrammer object
	/**
	 * Returns the string representation of the BasePlusCommissionProgrammer object.
	 * 
	 * @return the string representation of the BasePlusCommissionProgrammer object.
	 */
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f;", "base-plus", super.toString(), "base salary", getBaseSalary());
	}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

}
