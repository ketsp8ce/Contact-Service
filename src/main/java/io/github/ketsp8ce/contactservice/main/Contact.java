//Author Name: Hunter Marx

//Date: 03/27/2025

//Course ID: CS320-10813-M01

//Description: This is the contact class. It creates and stores contact information.
//See the Constructor for more info.

package io.github.ketsp8ce.contactservice.main;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
private final String contactID;
private String firstName;
private String lastName;
private String number;
private String address;
private static AtomicLong idGenerator = new AtomicLong();

//CONSTRUCTOR

public Contact(String firstName, String lastName, String number, String address)  {
	
//CONTACTID
//Contact ID is generated when the constructor is called. It is set as a final variable and has
//no other getter or setter so there should be no way to change it.
//The idGenerator is static to prevent duplicates across all contacts.
this.contactID = String.valueOf(idGenerator.getAndIncrement());

//FIRSTNAME

if (firstName == null || firstName.isBlank()) {

this.firstName = "NULL";

//If first name is longer than 10 characters, just grab the first 10 characters
} else if(firstName.length() > 10) {
this.firstName = firstName.substring(0, 10);
} else {
 this.firstName = firstName;
}

//LASTNAME
if (lastName == null || lastName.isBlank()) {
this.lastName = "NULL";
} else if(lastName.length() > 10) {
this.lastName = lastName.substring(0,10);
} else {
this.lastName = lastName;
}
//NUMBER
if (number == null || number.isBlank() || number.length() != 10) {
this.number = "5555555555";
} else {
this.number = number;
}
//ADDRESS
if (address == null || address.isBlank()) {
this.address = "NULL";
} else if(address.length() > 30) {
this.address = address.substring(0,30);
} else {
this.address = address;
}
}

//GETTERS
public String getContactID() {
return contactID;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getNumber() {
	return number;
}
public String getAddress() {
	return address;
}
	
//SETTERS

public void setFirstName(String firstName) {
	this.firstName = (firstName == null || firstName.isBlank()) ? "NULL" :
        firstName.substring(0, Math.min(firstName.length(), 10));
}
public void setLastName(String lastName) {
	this.lastName = (lastName == null || lastName.isBlank()) ? "NULL" :
        lastName.substring(0, Math.min(lastName.length(), 10));
}
public void setNumber(String number) {
	this.number = (number == null || number.isBlank() || number.length() != 10) ? 
            "8888888888" : number;
}
public void setAddress(String address) {
	this.address = (address == null || address.isBlank()) ? "NULL" :
        address.substring(0, Math.min(address.length(), 30));
}
	
}