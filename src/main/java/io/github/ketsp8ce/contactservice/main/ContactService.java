package io.github.ketsp8ce.contactservice.main;
//Author Name: Hunter Marx

//Date: 03/27/2025

//Course ID: CS320-10813-M01

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

public void deleteContact(String contactID) {
	//Deletes a contact
	for (int i = 0; i < contactList.size(); i++) {  //iterates through contact array list and checks the adress
	if (contactList.get(i).getContactID().equals(contactID)) { //if a given element in the contact array list matches the value at the adress for contact id, delete it  
		contactList.remove(i);
		return;
	}
	}
}

//update various fields
public void updateFirstName (String contactID, String updatedFirstName) {
	for (Contact contact : contactList) { //iterate through each contact object in the contactList array
		if (contact.getContactID().equals(contactID)) { //when it finds the specified contactID
			contact.setFirstName(updatedFirstName); //update the firstName field for that Contact object
		}
	}
}
public void updateLastName (String contactID, String updatedLastName) {
	for (Contact contact : contactList) {//iterate through each contact object in the contactList array
		if (contact.getContactID().equals(contactID)) { //when it finds the specified contactID
			contact.setLastName(updatedLastName); //update the lastName field for that Contact object
		}
	}
}
public void updateNumber (String contactID, String updatedNumber) {
	for (Contact contact : contactList) {//iterate through each contact object in the contactList array
		if (contact.getContactID().equals(contactID)) { //when it finds the specified contactID
			contact.setNumber(updatedNumber); //update the number field for that Contact object
		}
	}
}
public void updateAddress (String contactID, String updatedAddress) {
	for (Contact contact : contactList) {//iterate through each contact object in the contactList array
		if (contact.getContactID().equals(contactID)) { //when it finds the specified contactID
			contact.setAddress(updatedAddress); //update the address field for that Contact object
		}
	}
}
	
	public Contact getContact(String contactID) { //method to retrieve a given contact object
	    for (Contact contact : contactList) { //iterate through contact list
	        if (contact.getContactID().equals(contactID)) { //when we find the match .....
	            return contact; //return the information stored in its address
	        }
	    }
	    return null;
	}

	public ArrayList<Contact> getContactList() {
	    return contactList;
	}





}