package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	
	private ArrayList<AddressBookContacts> addressContactList;

	public AddressBook()
	{
		addressContactList = new ArrayList<AddressBookContacts>();
		
	}
	
	public void addContact(AddressBookContacts createPerson)
	{
		System.out.println("Adding a New Contact "+createPerson.firstname);
		addressContactList.add(createPerson);
		
	}
	
	public AddressBookContacts getContactInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fname =sc.nextLine();
		
		System.out.println("Enter your Last Name");
		String lname =sc.nextLine();
		
		System.out.println("Enter your Address");
		String address =sc.nextLine();
		
		System.out.println("Enter your City");
		String city =sc.nextLine();
		
		System.out.println("Enter your State");
		String state = sc.nextLine();
		
		System.out.println("Enter your zipcode");
		long zip =sc.nextLong();
		System.out.println("Enter your Phone Number");
		long phoneno =sc.nextLong();
		
		System.out.println("Enter your Email ID");
		String email =sc.nextLine();
		
		AddressBookContacts contact = new  AddressBookContacts(fname,lname,address,city,state,zip,phoneno,email);
		return contact;
	}
	
	public static void main(String args[]) {
		//storing the  contact details
		System.out.println("Welcome to AddressBook store All you contact Details");
		int choice=0;
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		while(true)
		{
			System.out.println("1.Add Contact 2.Exit ");
			System.out.println("Enter your Choice");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1: 	AddressBookContacts addressbookcontacts = ab.getContactInput();
					ab.addContact(addressbookcontacts);
					System.out.println("Conact added Successfully");
					break;
					
		case 2: 	System.out.println("you  are choosen to  exit ");
					return;
		
		default:
			
				System.out.println("you have entered invaild choice");
		}
		
	}
}
}
