//Anastasia Golev  Lab 3

/*Person class is for creating a person object. The class has fields for holding a 
 * person's name, address, and telephone number. It has a 3 parameter constructors
 * and mutator/accessor methods for the fields. 
 */
public class Person {

	//private member variables name, address, and phoneNumber
	private String name, address, phoneNumber;
	
	//3 parameter constructor to get data for member variables
	public Person( String nName, String nAddress, String nPhoneNumber) {
		name = nName;
		address = nAddress;
		phoneNumber = nPhoneNumber;
	}
	
	//accessor/mutator methods
	public void setName( String nName ) {
		name = nName;
	}
	public void setAddress( String nAddress ) {
		address = nAddress;
	}
	public void setPhoneNumber( String nPhoneNumber ) {
		phoneNumber = nPhoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//toString method
	public String toString() {
		String s = "";
		s += "Customer Name: " + name + "\n";
		s += "Address: " + address + "\n";
		s += "Phone Number: " + phoneNumber + "\n";
		return s;
	} //end toString() method
	
	
}
