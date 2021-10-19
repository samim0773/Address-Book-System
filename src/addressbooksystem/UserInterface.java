package addressbooksystem;
import java.util.*;

public class UserInterface {
	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}
}
