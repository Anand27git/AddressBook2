public class AddressBook {

	public static void main(String args[]) {
		//storing the  contact details
		System.out.println("Welcome to AddressBook store All you contact Details");
		AddressBookContacts contact = new AddressBookContacts("Anand", "Kumar", "Bangalore", "Bangarpet", "Karnataka",
				"563114", "8088533154", "anandKumar256k@gmail.com");
		contact.ContactDetails();

	}
}
