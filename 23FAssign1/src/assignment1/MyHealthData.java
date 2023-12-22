/**
 * Student Name: Ting Cheng
 * Professor: Moshiur Rahman
 * Due Date: October 15,2023
 * Description:  CST8284-303 Assignment1  
 * Modify Date: October 1,2023 
 */

package assignment1;

import java.time.LocalDate;

/**
 * This class maintains important patient¡¯s electronic record. Created on
 * Sep.30,2023.
 * 
 * @see java.time.LocalDate
 * @version 2.0
 * @since javac 17.0.7
 * @author Ting Cheng
 */
public class MyHealthData extends MyHealthDataBase {

	// 23F CST8284
	// Assignment 1: MyHealthData.java

	// This system maintains important health information about a patient.
	// Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
	// Remove unneeded comments when you are done. Clean code is better code.

	// TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS
	// DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
	/**
	 * firstName component of the MyHealthDataDate.
	 */
	private String firstName;

	/**
	 * lastName component of the MyHealthDataDate.
	 */
	private String lastName;

	/**
	 * gender component of the MyHealthDataDate.
	 */
	private String gender;

	/**
	 * birthYear component of the MyHealthDataDate.
	 */
	private int birthYear;

	/**
	 * currentYear component of the MyHealthDataDate.
	 */
	private static int currentYear = LocalDate.now().getYear();

	/**
	 * height component of the MyHealthDataDate.
	 */
	private double height;

	/**
	 * weight component of the MyHealthDataDate.
	 */
	private double weight;

	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE
	/**
	 * The default constructor sets firstName, lastYear, gender, height, weight,
	 * birthYear, currentYear as default.
	 */
	public MyHealthData() {
		// super();
	};

	/**
	 * overloaded constructor sets This constructor sets firstName, lastYear,
	 * gender, height, weight, birthYear, currentYear all as passed.
	 * 
	 * @param firstName The firstName of MyHealthData.
	 * @param lastName  The lastName of MyHealthData.
	 * @param gender    The gender of MyHealthData.
	 * @param birthYear The birthYear of MyHealthData.
	 * @param height    The height of MyHealthData.
	 * @param weight    The weight of MyHealthData.
	 */

	public MyHealthData(String firstName, String lastName, String gender, int birthYear, double height, double weight) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
	}

	// TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE
	// ALL ARE COMPLETE.
	/**
	 * Returns the firstName for this MyHealthData.
	 * 
	 * @return the firstName for this MyHealthData.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName for this MyHealthData.
	 * 
	 * @param firstName The firstName for this MyHealthData.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the lastName for this MyHealthData.
	 * 
	 * @return the lastName for this MyHealthData.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName for this MyHealthData.
	 * 
	 * @param lastName The lastName for this MyHealthData.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender for this MyHealthData.
	 * 
	 * @return the gender for this MyHealthData.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender for this MyHealthData.
	 * 
	 * @param gender The gender for this MyHealthData.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the birthYear for this MyHealthData.
	 * 
	 * @return the birthYear for this MyHealthData.
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birthYear for this MyHealthData.
	 * 
	 * @param birthYear The birthYear for this MyHealthData.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the height for this MyHealthData.
	 * 
	 * @return the height for this MyHealthData.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height for this MyHealthData.
	 * 
	 * @param height The height for this MyHealthData.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the weight for this MyHealthData.
	 * 
	 * @return the weight for this MyHealthData.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight for this MyHealthData.
	 * 
	 * @param weight The weight for this MyHealthData.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns the currentYear for this MyHealthData.
	 * 
	 * @return the currentYear for this MyHealthData by using LocalDate class.
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA.
	// DO NOT MISS ANY DATA / INFORMATION
	/**
	 * Method to get age by calculation.
	 * 
	 * @return the calculated age.
	 */
	public int getAge() {
		return currentYear - birthYear;
	}

	/**
	 * Method to get MaximumHeartRate.
	 * 
	 * @return the calculated MaximumHeartRate.
	 */
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}

	/**
	 * Method to get MinimumTargetHeartRate.
	 * 
	 * @return the calculated MinimumTargetHeartRate.
	 */
	public double getMinimumTargetHeartRate() {
		return 0.5 * getMaximumHeartRate();
	}

	/**
	 * Method to get MaximumTargetHeartRate.
	 * 
	 * @return the calculated MaximumTargetHeartRate.
	 */
	public double getMaximumTargetHeartRate() {
		return 0.85 * getMaximumHeartRate();
	}

	/**
	 * Gets the BMI.
	 * 
	 * @return BMI calculation using method calculateBMI from superclass
	 *         MyHealthDataBase.
	 */
	public double getBMI() {
		return calculateBMI(weight, height);
	}

	/**
	 * The method is using System.out.printf TO SHOW ALL HEALTH DATA.
	 */
	public void displayMyHealthData() {

		// TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS
		// ANY ITEM.
		System.out.printf("First Name: %s%n", getFirstName());
		System.out.printf("Last Name: %s%n", getLastName());
		System.out.printf("Gender: %s%n", getGender());
		System.out.printf("Birth Year: %d%n", getBirthYear());
		System.out.printf("Height: %.2f%n", getHeight());
		System.out.printf("Weight: %.2f%n", getWeight());
		System.out.printf("Age: %d%n", getAge());
		System.out.printf("BMI: %.1f%n", getBMI());

		if (getBMI() < 18.5) {
			System.out.println("Underweight: 	less than 18.5");
		} else if (getBMI() < 24.9) {
			System.out.println("Normal: 	between 18.5 and 24.9");
		} else if (getBMI() < 30) {
			System.out.println("Overweight:	between 25 and 29.9");
		} else {
			System.out.println("Obese:      30 or greater");
		}
		System.out.printf("Maximum Heart Rate: %d%n", getMaximumHeartRate());
		System.out.printf("The patient's target heart rate range: %.2f-%.2f%n%n", getMinimumTargetHeartRate(),
				getMaximumTargetHeartRate());

		// You do not need to modify this piece of code, it is fine as it is.

//       System.out.println("BMI VALUES");
//       System.out.println("Underweight: less than 18.5");
//       System.out.println("Normal:      between 18.5 and 24.9");
//       System.out.println("Overweight:  between 25 and 29.9");
//       System.out.println("Obese:       30 or greater");   
	}

} // end class MyHealthData