/**
 * Student Name: Ting Cheng
 * Professor: Moshiur Rahman
 * Due Date: October 15,2023
 * Description:  CST8284-303 Assignment1  
 * Modify Date: October 1,2023 
 */
package assignment1;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * MyHealthDataTest2 is a JUnit test class for testing the MyHealthDataBase class.
 * In this class, we test the calculateBMI() method with correct math.
 * Additionally, we explain that the MyHealthDataBase class contains an intentional
 * error in the incorrectBMI() method where the BMI calculation is incorrect. 
 * This test class does not test the incorrectBMI() method for correctness.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see org.junit.Test
 */
public class MyHealthDataTest2 {
	
	/**
	 * This is the JUnit test method to verify the correctness of calculateBMI() method.
	 * It tests the calculateBMI() method with valid input values and asserts that the 
	 * result falls within an acceptable tolerance..
	 */
	@Test
	public void test() {
		MyHealthDataBase test = new MyHealthDataBase();
		double result = test.calculateBMI(143.3,68.9);
		assertEquals(21.2,result,0.1);
	}

}
