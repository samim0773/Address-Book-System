package addressbooksystem;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		AddressBook c1 = new AddressBook();
		c1.setFirstName("Samim");
		c1.setLastName("Aktar");
		c1.setAddress("Ghatkesar");
		c1.setCity("Hyderabad");
		c1.setState("Telangana");
		c1.setZip("501301");
		c1.setPhoneNumber("123456");
		c1.setEmail("Samim@gmail.com");
		
		AddressBook c2= new AddressBook();
		c2.setFirstName("Jon");
		c2.setLastName("Jack");
		c2.setAddress("Howrha");
		c2.setCity("Kolkata");
		c2.setState("WestBengal");
		c2.setZip("732124");
		c2.setPhoneNumber("67890");
		c2.setEmail("jon@gmail.com");
		
		AddressBook c3= new AddressBook();
		c3.setFirstName("Vikas");
		c3.setLastName("Gupta");
		c3.setAddress("HiTech");
		c3.setCity("Hyderabad");
		c3.setState("Telangana");
		c3.setZip("234543");
		c3.setPhoneNumber("247564");
		c3.setEmail("vikas@gmail.com");
		
		ContactStore contactStore =new ContactStore();
		contactStore.add(c1);
		contactStore.add(c2);
		contactStore.add(c3);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(contactStore.getContactList());
		
		
		
	}

}
