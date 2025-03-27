package io.github.ketsp8ce.contactservice.main;
//Author Name: 

//Date: 

//Course ID: 

//Description: This is the contact service. It maintains a list of contacts and has capabilities
//for adding and deleting contacts, as well as updating first name, last name, phone number, and address.


import java.util.ArrayList;



public class ContactService {
	

//Start with an ArrayList of contacts to hold the list of contacts
ArrayList<Contact> contactList = new ArrayList<Contact>();

//Display the full list of contacts to the console for error checking.
public void displayContactList() {
for(int counter = 0; counter < contactList.size(); counter++) {
System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
}
}

//Adds a new contact using the Contact constructor, then assign the new contact to the list.
public void addContact(String firstName, String lastName, String number, String address) {
//Create the new contact
	Contact contact = new Contact(firstName, lastName, number, address);
	contactList.add(contact);
	}

public void deleteContact(String firstName, String lastName, String number, String address) {
	//Deletes a contact
	
}
public void updateContact(String firstName, String lastName, String number, String address) {
}
//Updates a contact
}