
public class PersonInfo {

	String firstName;
	String lastName;
	String phoneNumber;
	String city;
	String zip;
	
	//Parameterized constructor
	PersonInfo(String firstName , String lastName , String phoneNumber , String city  , String zip){
		this.firstName=firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.zip = zip;
		
	}
	
	//displays the person info
		public void print() {
			System.out.println("Firstname : " + firstName + " LastName : " + lastName + " PhoneNumber : " + phoneNumber + " City : " + city + " Zip Code : " + zip );
		}
}