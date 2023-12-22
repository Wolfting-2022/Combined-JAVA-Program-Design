/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */

package lab6.cst8284;

/**
 * This is an abstract superclass that IMPLEMENTS the Payme interface.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see Programmer
 *
 */

public abstract class Programmer implements Payme {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	/**
	 * Constructor for Programmer class, three-argument constructor
	 * 
	 * @param first the first name of the Programmer
	 * @param last  the last name of the Programmer
	 * @param ssn   the social security number of the Programmer
	 * 
	 */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/**
	 * CHANGES ARE REQUIRED IN THIS SECTION. THINK OF THE BEST WAY TO ACCESS PRIVATE
	 * VARIABLES. IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	 */

	/**
	 * Getter method for first name.
	 * 
	 * @return the first name of the Programmer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for first name.
	 * 
	 * @param firstName the first name of the Programmer
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method for last name.
	 * 
	 * @return the last name of the Programmer
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for last name.
	 * 
	 * @param lastName the last name of the Programmer
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter method for social security number.
	 * 
	 * @return the social security number of the Programmer
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Setter method for social security number.
	 * 
	 * @param socialSecurityNumber the social security number of the Programmer
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// return String representation of Programmer object Original String.format has
	// issue£¡£¡£¡
	/**
	 * @return String representation of Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber());
	}

	// Note: We do NOT implement Payme method getPaymentAmount() here.
	// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS
	// AS....??

	// public abstract double getPaymentAmount();		//Really can not implement!!!

	/** No implementation here. DO YOU KNOW WHY? What should this method be? */
	// public abstract double earnings();
}
