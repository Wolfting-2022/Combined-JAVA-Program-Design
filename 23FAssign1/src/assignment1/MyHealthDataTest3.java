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
 * This test class test the incorrectBMI() method for correctness.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see org.junit.Test
 */
public class MyHealthDataTest3 {

	/**
	 * This is the JUnit test method to verify the incorrectness of calculateBMI() method.
	 * It tests the calculateBMI() method with invalid input to assert the result.
	 */
	@Test
	/**
	 * This is the method to test calculateBMI incorrectly.
	 */
	public void test() {
		MyHealthDataBase test2 = new MyHealthDataBase();
		double result = test2.incorrectBMI(143.3,68.9);
		double expected = 143.3 * 703 / (68.9 * 68.9);
		assertEquals(expected,result,0.1);
	}

}
