public class AddressBookContacts {
	//declaring static variables
	public final String firstname, lastname;
	public final String address, city, state;
	public final String zip;
	public final String phonenumber;
	public final String email;

	public AddressBookContacts(String firstname, String lastname, String address, String city, String state, String zip,String phonenumber, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
	}

	public void ContactDetails() {
		System.out.println("First Name :" + firstname);
		System.out.println("Last Name :" + lastname);
		System.out.println("Address:" + address);
		System.out.println("City:" + city);
		System.out.println("State" + state);
		System.out.println("Zip" + zip);
		System.out.println("PhoneNumber" + phonenumber);
		System.out.println("Email:" + email);
	}
}
