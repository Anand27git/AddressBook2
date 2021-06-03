package com.bridgelabz.addressbook;

public class AddressBookContacts {
	public String firstname, lastname, address, city, state, email;
	public long zip;;
	public long phoneno;

	public AddressBookContacts(String firstname, String lastname, String address, String city, String state, long zip,
			long phoneno, String email){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneno = phoneno;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}

	public long getZip() {
		return zip;
	}

	public long getPhoneNo() {
		return phoneno;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public void setAddress(String address) {
			this.firstname = address;
	}
	public void setCity(String city) {
				this.city=city;
	}
	public void setState(String state) {
					this.state =state;
	}
	public void setEmail(String email) {
						this.email = email;
	}

	public void setZip(long zip) {
	this.zip = zip;
	}
	public void setPhoneNo(long phoneno) {
		this.phoneno = phoneno;

	}

	@Override
	public String toString() {
		return "AddressBookContacts [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", email=" + email + ", zip=" + zip + ", phoneno=" + phoneno
				+ "]";
	}

}
