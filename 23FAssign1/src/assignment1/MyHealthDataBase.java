/**
 * Student Name: Ting Cheng
 * Professor: Moshiur Rahman
 * Due Date: October 15,2023
 * Description:  CST8284-303 Assignment1  
 * Modify Date: October 1,2023 
 */
 
package assignment1;

/**
 * MyHealthDataTest2 is a JUnit test class for testing the MyHealthDataBase
 * class. In this class, we test the calculateBMI() method with correct math.
 * Additionally, we explain that the MyHealthDataBase class contains an
 * intentional error in the incorrectBMI() method where the BMI calculation is
 * incorrect. This test class does not test the incorrectBMI() method for
 * correctness.
 * 
 * @author Your Name
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see java.lang.Object
 */

public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the CORRECT calculation for BMI.
    */	
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    
    /** 
    * This method returns the incorrect calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the INCORRECT calculation for BMI.
    */
    public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam * 600 / (heightParam * heightParam);
    } 
    
}