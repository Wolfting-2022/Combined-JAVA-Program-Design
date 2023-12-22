/*
 * Student Name: Ting Cheng
 * Lab Professor: Moshiur Rahman
 * Due Date: Nov 19, 2023 
 * Modified by: Nov 10, 2023 
 * Description:  CST8284-303 Lab6      
 */

package lab6.cst8284;

/**
 * The class Invoice implements Payme interface.
 * 
 * @author Ting Cheng
 * @version 2.0
 * @since javac 17.0.7
 * @see Invoice
 *
 */

public class Invoice implements Payme {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

//four-argument constructor
	/**
	 * Constructs an Invoice object with the given part number, description,
	 * quantity and price per item.
	 * 
	 * @param part        the part number of the product
	 * @param description the description of the product
	 * @param count       the quantity of the product
	 * @param price       the price per item of the product
	 */

	public Invoice(String part, String description, int count, double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

//set part number
	/**
	 * Sets the part number of the product.
	 * 
	 * @param part the part number of the product
	 */
	public void setPartNumber(String part) {
		partNumber = part;
	}

//get part number
	/**
	 * Returns the part number of the product.
	 * 
	 * @return the part number of the product
	 */
	public String getPartNumber() {
		return partNumber;
	}

//set description
	/**
	 * Sets the description of the product.
	 * 
	 * @param description the description of the product
	 */
	public void setPartDescription(String description) {
		partDescription = description;
	}

//get description
	/**
	 * Returns the description of the product.
	 * 
	 * @return the description of the product
	 */
	public String getPartDescription() {
		return partDescription;
	}

//set quantity
	/**
	 * Sets the quantity of the product.
	 * 
	 * @param count the quantity of the product
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

//get quantity
	/**
	 * Returns the quantity of the product.
	 * 
	 * @return the quantity of the product
	 */
	public int getQuantity() {
		return quantity;
	}

//set price per item
	/**
	 * Setter method for Price Per Item.
	 * 
	 * @param price the price for each item
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

//get price per item
	/**
	 * Returns the price per item of the product.
	 * 
	 * @return the price per item of the product
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

//return String representation of Invoice object
	/**
	 * Returns the string representation of the Invoice object.
	 * 
	 * @return the string representation of the Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(),
				getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	}

//method required to carry out contract with interface Payme
	/**
	 * Calculates and returns the payment amount for the invoice.
	 * 
	 * @return the payment amount for the invoice
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
