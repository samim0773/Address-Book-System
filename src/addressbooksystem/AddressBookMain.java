package addressbooksystem;

import java.util.*;

public class AddressBookMain {
	public static void main(String[] args) {
		// print welcome message
		System.out.println("WELCOME  TO ADDRESS BOOK PROGRAM");

		// create object for customer 1
		AddressBook contactOne = new AddressBook();

		// pass customer 1 data
		contactOne.setFirstName("Samim");
		contactOne.setLastName("Aktar");
		contactOne.setAddress("Ghatkesar");
		contactOne.setCity("Hyderabad");
		contactOne.setState("Telangana");
		contactOne.setZip("501301");
		contactOne.setPhoneNumber("123456");
		contactOne.setEmail("Samim@gmail.com");
		
		// create object in AddressBook class for add new person
		AddressBook contactTwo = new AddressBook();
		
		// create object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Print Message for user
		System.out.println("------- Enter details of new person ---------");
		
		// take input from user
		System.out.print("Enter Frist Name: ");
		contactTwo.setFirstName(scanner.nextLine());
		System.out.print("Enter Last Name: ");
		contactTwo.setLastName(scanner.nextLine());
		System.out.print("Enter Address: ");
		contactTwo.setAddress(scanner.nextLine());
		System.out.print("Enter City: ");
		contactTwo.setCity(scanner.nextLine());
		System.out.print("Enter State: ");
		contactTwo.setState(scanner.nextLine());
		System.out.print("Enter Pin: ");
		contactTwo.setZip(scanner.nextLine());
		System.out.print("Enter Phone Number: ");
		contactTwo.setPhoneNumber(scanner.nextLine());
		System.out.print("Enter Email: ");
		contactTwo.setEmail(scanner.nextLine());

		// create object for contactStore
		ContactStore contactStore = new ContactStore();

		// add customer data into contact store
		contactStore.add(contactOne);
		contactStore.add(contactTwo);
		
		// create object for userInterface 
		UserInterface userInterface = new UserInterface();
		
		// print contact details
		userInterface.print(contactStore.getContactList());
	
		System.out.println("--------- Contact Edit ------------");
		// print message for user 
		
		System.out.print("Find contact detail using First Name: ");
		String name = scanner.nextLine();
		
		// check contact is available or not
		if(contactOne.getFirstName().equalsIgnoreCase(name) == true)
			userInterface.edit(contactOne);
		else if (contactTwo.getFirstName().equalsIgnoreCase(name)== true)
			userInterface.edit(contactTwo);
		else
			System.out.println("Contact Details invalid");
		
		System.out.println(" -------- Contact List after edit ---------- ");
		userInterface.print(contactStore.getContactList());
		
		System.out.println("--------- Delete Contact ------------");
		
		// print message for user
		System.out.print("Find contact detail using First Name: ");
		String contactName = scanner.nextLine();
		
		// remove contact detail
		if(contactOne.getFirstName().equalsIgnoreCase(contactName) == true)
			contactStore.remove(contactOne);
		else if (contactTwo.getFirstName().equalsIgnoreCase(contactName) == true)
			contactStore.remove(contactTwo);
		else
			System.err.println("Contact details not found");
		
		System.out.println(" -------- Contact List after delete ---------- ");
		userInterface.print(contactStore.getContactList());
		
	}

}
