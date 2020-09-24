import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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
	
	 public void savePersons() {
		 try {
			 	PersonInfo p;
			 	String line;
			 	FileWriter fw = new FileWriter("persons.txt");
			 	PrintWriter pw = new PrintWriter(fw);
			 	for(int i=0; i<persons.size(); i++)
			 	{
			 		p = (PersonInfo)persons.get(i);
			 		line = p.firstName +"  "+ p.lastName +"  "+ p.phoneNumber + "  " + p.city + "  " + p.zip;
			 		// writes line to file (persons.txt)
			 		pw.println(line);
			 	}
			 	pw.flush();
			 	pw.close();
			 	fw.close();
			 	}catch(IOException ioEx){
			 		System.out.println(ioEx);
			 }
	}
	 
	 public void loadPersons ( ){
		 String tokens[] = null;
		 String firstName,lastName, zip, phoneNumber,city;
		 try {
			 FileReader fr = new FileReader("persons.txt");
			 BufferedReader br = new BufferedReader(fr);
			 String line = br.readLine();
			 while ( line != null ) {
				 tokens = line.split("  ");
				 firstName = tokens[0];
				 lastName = tokens[1];
				 phoneNumber = tokens[2];
				 city = tokens[3];
				 zip = tokens[4];
				 PersonInfo p = new PersonInfo(firstName, lastName, phoneNumber,city,zip);
				 persons.add(p);
				 line = br.readLine();
		 }
		 br.close();
		 fr.close();
		 }catch(IOException ioEx){
		 System.out.println(ioEx);
		 }
		 }
 }
	

