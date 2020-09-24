import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList persons;

	// Constructor
	public AddressBook() {
		persons = new ArrayList();
	}

	// add new person record to arrayList
	public void addPerson() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Name : ");
		String firstName = scan.nextLine();
		System.out.println("Enter last Name : ");
		String lastName = scan.nextLine();
		System.out.println("Enter Phone Number : ");
		String phoneNumber = scan.nextLine();
		System.out.println("Enter your city : ");
		String city = scan.nextLine();
		System.out.println("Enter your zip code : ");
		String zip = scan.nextLine();

		// construct new person object
		PersonInfo p = new PersonInfo(firstName, lastName, phoneNumber, city , zip);

		// adding person to arraylist
		persons.add(p);
		
	}
	//search person record by name by iterating over arraylist
	public void searchPerson(String n) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.firstName)) {
				p.print();
			}
		} 
	} 	
	//search person record by name by iterating over arraylist
		public void view() {
			for (int i = 0; i < persons.size(); i++) {
				PersonInfo p = (PersonInfo) persons.get(i);
					p.print();
					System.out.println("-------------------------------------------------------------------------------------------------------------------");
			} 
		} 
	 //delete person record by name by iterating over arraylist
	 public void deletePerson (String n) {
		 for (int i=0; i< persons.size(); i++) {
			 PersonInfo p = (PersonInfo)persons.get(i);
			 if ( n.equals(p.firstName) ) {
				 persons.remove(i);
				 System.out.println(n + " removed successfully!!!");
			 }
		 }
	 } 
}


