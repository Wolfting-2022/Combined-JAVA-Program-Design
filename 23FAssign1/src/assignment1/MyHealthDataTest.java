/**
 * Student Name: Ting Cheng
 * Professor: Moshiur Rahman
 * Due Date: October 15,2023
 * Description:  CST8284-303 Assignment1  
 * Modify Date: October 1,2023 
 */

package assignment1;
import java.util.Scanner;

/**
 * This class contains a main method that runs the program, print the data.
 * Created on Sep.30,2023.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see java.util.Scanner
 */

public class MyHealthDataTest {

	/**
	 * This is the entry point for the application.
	 * 
	 * @param args supplies command-line arguments as an array of String objects
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		String firstName, lastName, gender;
		int birthYear;
		double height, weight;

		System.out.println("Enter patient's first name: ");
		firstName = scanner.nextLine();

		System.out.println("Enter patient's last name: ");
		lastName = scanner.nextLine();

		System.out.println("Enter patient's gender: ");
		gender = scanner.nextLine();

		System.out.println("Enter patient's birth year: ");
		birthYear = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter patient's height(in inches): ");
		height = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Enter patient's weight(in pounds): ");
		weight = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println();

		MyHealthData patient = new MyHealthData(firstName, lastName, gender, birthYear, height, weight );
		
		patient.displayMyHealthData();

		scanner.close();

	}

}
