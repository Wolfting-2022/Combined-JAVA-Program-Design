/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */

package lab6.cst8284;

/**
 * This class defines a Java interface named "Payme" which contains a method
 * called "getPaymentAmount" method.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see Payme
 *
 */

public abstract interface Payme {
	/**
	 * Method to get the payment amount
	 * 
	 * @return a double value
	 */
	public abstract double getPaymentAmount();

//	default void display() {
//		System.out.println(this.toString());
//	}	
}
