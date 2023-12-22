/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */
package lab6.cst8284;

/**
 * This class called PaymeInterfaceTest test for interface Payme.
 * 
 * @author Haiyan Yang
 * @version 1.0
 * @since javac 17.0.4.1
 * @see PaymeInterfaceTest
 */
public class PaymeInterfaceTest  {
	/**
	 * Entry method for the PaymeInterfaceTest class.
	 * 
	 * @param args an array of command-line arguments.
	 */

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 

//END CODE
 Payme[] paymeArray = new Payme[6];

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE

// END CODE
 paymeArray[0]=new Invoice("22276", "brakes", 3, 300);
 paymeArray[1]=new Invoice("33442", "gear", 5, 90.99);
 paymeArray[2]=new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001",1,1990,40);
 paymeArray[3]=new HourlyProgrammer("Amara", "Chukwu", "234-56-7770",2,1993,18.95,40);
 paymeArray[4]=new CommissionProgrammer("Peter", "Goodman", "123-45-6999",3,1980,16500,0.44);
 paymeArray[5]=new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888",4,1982,1200,0.04,720);
 
 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeArray) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       

    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissionProgrammer reference, and know why we're doing thisS
    	// currentPayme is an element from the paymeArray, which is of type "Payme"
    	// CAST currentPayme DOWN to the BasePlusCommissionProgrammer type
    	// BasePlusCommissionProgrammer should be child of Payme,unless can cause ClassCastException at runtime, 
       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.05 * oldBaseSalary);
       
       	// % is an escape character
       	// , is a group separator,adding commas is as a thousands separator 
       System.out.printf("new base salary with 5%% increase is: $%,.2f%n",programmer.getBaseSalary());			
      
    } 

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 
  System.out.printf("payment due: $%,.2f%n",currentPayme.getPaymentAmount());
  System.out.println();
// END CODE

 }
}
}


