//Anastasia Golev  Lab 3

/* The Customer class is designed to create a customer object. The Customer
 * class extends the Person class. It has 2 fields, an integer variable called 
 * customerNumber to represents the customer's number and a boolean variable mailingPref
 * indicating whether the customer wishes to be on a mailing list. In addition the class
 * has appropriate constructors and mutator/accessor methods
 */

public class Customer extends Person {

	//private member variables int customerNumber and boolean mailingPref
	private int customerNumber;
	private boolean mailingPref;
	
	//5 param constructor to get data for member variables
	public Customer( String nName, String nAddress, String nPhoneNumber, int nCustomerNumber, boolean nMailingPref) {
		super( nName,  nAddress,  nPhoneNumber); //keyword super to get data via parent class
		customerNumber = nCustomerNumber;
		mailingPref = nMailingPref;
	}
	
	//mutator/accessor methods
	public void setCustomerNumber( int nCustomerNumber ) {
		customerNumber = nCustomerNumber;
	}
	public void setMailingList( boolean nMailingPref ) {
		mailingPref = nMailingPref;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public boolean getMailingPreference() {
		return mailingPref;
	}
	
	//toString method
	public String toString() {
		String s = super.toString();
		s += "Customer Number: " + customerNumber + "\n";
		s += "Mailing Preference: ";
		
		//if mailing preference of customer is true, output "Yes" indicating that 
		//the customer is on the mailing list
		if (mailingPref == true) {
			s += "Yes \n";
		}else { //else output "No"
			s +="No \n"; 
		}
		return s;
	}//end toString() method
	
}
