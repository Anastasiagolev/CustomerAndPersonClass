//Anastasia Golev Lab 3

/* 
 * PreferredCustomer class extends the Customer class. It represents a plan where customers can earn discounts on all their 
 * purchases. Discount is determined by the amount of the customer's cumulative purchases as follows:
 * 			when preferred customer spends $500, there is a 5% discount on all future purchases
 * 			when preferred customer spends $1000, there is a 6% discount on all future purchases
 * 			when preferred customer spends $1500, there is a 7% discount on all future purchases
 * 			when preferred customer spends $2000, there is a 10% discount on all future purchases
 * PreferredCustomer class has fields for the amount of the customer's purchases, called amountOfPurchase and the customer's 
 * discount level, called discountLevel. In Addition, the class has a public void method called makePurchase that takes a 
 * double variable as its parameter. This method adds the parameter to the internal amount spent variable for the 
 * PreferredCustomer; then updates the discount if this PreferredCustomer has reached a new rewards tier.*/

public class PreferredCustomer extends Customer {

	//member variables to represent the amount of a customer's purchases, and their discount level
	private double amountOfPurchases;
	private double discountLevel; 

	//7 parameter constructor to assign data to member variables
	public PreferredCustomer(String nName, String nAddress, String nPhoneNumber, int nCustomerNumber,
			boolean nMailingPref, double nAmountOfPurchases, double nDiscountLevel) {
		
		super( nName,  nAddress,  nPhoneNumber,  nCustomerNumber, nMailingPref);//keyword super to get data via parent class
		amountOfPurchases = nAmountOfPurchases;
		discountLevel = nDiscountLevel;
	}

	//mutator/accessor methods
	public double getAmountOfPurchases() {
		return amountOfPurchases;
	}

	public double getDiscountLevel() {
		return discountLevel;
	}

	public void setAmountOfPurchases(double amountOfPurchases) {
		this.amountOfPurchases = amountOfPurchases;
	}

	public void setDiscountLevel(double discountLevel) {
		this.discountLevel = discountLevel;
	}
	
	/* public void makePurchase( double ) adds parameter to the member variable amountOfPurchase. It will update the 
	 * discountLevel if the PreferredCustomer object has reached a new rewards tier. It also updates the amount spent
	 * depending of discountLevel. */
	public void makePurchase( double valueSpent ) {
		//create double totalValue to represent the amount of purchases of object
		double totalValue = getAmountOfPurchases();
		
		//update valueSpent based on discountLevel
		valueSpent -= getDiscountLevel()*valueSpent;
		
		//add the adjusted valueSpent to the totalValue 
		totalValue += valueSpent;
		
		//set the amount of purchases of the object to be saved in the member variable amountOfPurchases
		setAmountOfPurchases(totalValue);
		
		//check if PreferredCustomer object qualifies for a discount based on new purchase made
		//begin at 500 to guarantee that if less than 500 spent, there is no discount 
		if (getAmountOfPurchases() >= 500 && getAmountOfPurchases() < 1000) {
			setDiscountLevel(0.05);
		}
		else if (getAmountOfPurchases() >= 1000 && getAmountOfPurchases() < 1500) {
			setDiscountLevel(0.06);
		}
		else if (getAmountOfPurchases() >= 1500 && getAmountOfPurchases() < 2000) {
			setDiscountLevel(0.07);
		}
		else if (getAmountOfPurchases() >= 2000) { 
			setDiscountLevel(0.1);
		}
		
	} //end makePurchase() method
	
	//toString method
	public String toString() {
		String s = super.toString();
		s += "Amount of Purchases: " + amountOfPurchases + "\n";
		s += "Discount Level: " + discountLevel + "\n";
		return s;
	} //end toString() method
}
