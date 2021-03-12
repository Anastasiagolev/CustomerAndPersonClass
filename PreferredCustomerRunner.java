//Anastasia Golev  Lab 3
/*
 * PreferredCustomerRunner displays the PreferredCustomer class, its constructor and its 
 * makePurchase() method.
 */
public class PreferredCustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prefCustomer1 is a PreferredCustomer object with an initial amountOfPurchase value of 230.67
		PreferredCustomer prefCustomer1 = new PreferredCustomer("Anastasia", "123 ABC Lane", "123456789", 1, false, 230.67, 0.0);
		System.out.println(prefCustomer1.toString()); //display object data
		
		//prefCustomer1 makes a purchase of 300, bringing them to a new discount tier of 0.05
		prefCustomer1.makePurchase(300);
		System.out.println(prefCustomer1.toString()); //display updated object data
		
		//prefCustomer1 makes a purchase of 1000, bringing them to a new discount tier of 0.06
		prefCustomer1.makePurchase(1000);
		System.out.println(prefCustomer1.toString());
	}

}

/* Output 

Customer Name: Anastasia
Address: 123 ABC Lane
Phone Number: 123456789
Customer Number: 1
Mailing Preference: No 
Amount of Purchases: 230.67
Discount Level: 0.0

Customer Name: Anastasia
Address: 123 ABC Lane
Phone Number: 123456789
Customer Number: 1
Mailing Preference: No 
Amount of Purchases: 530.67
Discount Level: 0.05

Customer Name: Anastasia
Address: 123 ABC Lane
Phone Number: 123456789
Customer Number: 1
Mailing Preference: No 
Amount of Purchases: 1480.67
Discount Level: 0.06

*/