package addressbooksystem;
import java.util.HashSet;
import java.util.Set;

public class ContactStore {
	private Set<AddressBook> contactList = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}

	public void add(AddressBook contact) {
		contactList.add(contact);
	}
	
	public void remove(AddressBook contact) {
		contactList.remove(contact);
	}

}
