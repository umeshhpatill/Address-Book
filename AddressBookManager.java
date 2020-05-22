package addressbook;

import java.util.Scanner;

public class AddressBookManager {

	public void newAddressBook() {
		AddressBook obj=new AddressBook();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Book Name");
		String name =scanner.next();
		System.out.println("-----------------------");
		System.out.println("1 :  addPerson");
		System.out.println("-----------------------");
		int choice =scanner.nextInt();
		switch (choice) {
		case 1: 
			obj.addPerson();
		
		}
	}
	public void openAddressBook() {
		AddressBook obj=new AddressBook();
		
		obj.dispaly();
	}
	public void saveAddressBook() {
		AddressBook obj=new AddressBook(); 
	}
	public void saveAsAddressBook() {	 	
	}
	public void closeAddressBook() {		
	}
	public void quit() {
		
	}

}
