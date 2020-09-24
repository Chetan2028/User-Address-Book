
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		
		AddressBook ab = new AddressBook();
		
		String input , s;
		int ch;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 to add \n" + "Enter 2 to search \n" + "Enter 3 to delete \n"  + "ENter 4 to view" + "\nEnter 5 to quit \n" );
			input = scan.nextLine();
			ch = Integer.parseInt(input);
			
			switch(ch) {
				
			case 1 :
				ab.addPerson();
				break;
			
			case 2 : 
				System.out.println("Enter the name to search");
				s = scan.nextLine();
				ab.searchPerson(s);
				break;
			
			case 3 :
				System.out.println("Enter the name to delete");
				s = scan.nextLine();
				ab.deletePerson(s);
				break;
			
			case 4 :
				System.out.println("Printing the data : " );
				ab.view();
				
				break;
				
			default : 
				System.exit(0);
			}
			
		}

	}

}
