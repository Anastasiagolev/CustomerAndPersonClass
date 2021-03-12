//Anastasia Golev  Lab 3

/* PersonAndCustomerRunner will display the Customer class (which extends the Person class) */

public class PersonAndCustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//demonstrate an object of the Customer class in a simple program
		Customer customer1 = new Customer("Anastasia", "123 ABC Lane", "123456789", 1, false);
		
		System.out.println(customer1.toString());
		
		Customer customer2 = new Customer("Bob", "1 Seasame Street", "0000000000", 2, true);
		
		System.out.println(customer2.toString());
	}

}

/* Output

Customer Name: Anastasia
Address: 123 ABC Lane
Phone Number: 123456789
Customer Number: 1
Mailing Preference: No 

Customer Name: Bob
Address: 1 Seasame Street
Phone Number: 0000000000
Customer Number: 2
Mailing Preference: Yes 


*/