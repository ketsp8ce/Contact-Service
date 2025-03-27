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
/*
* The constructor takes first name, last name, phone number, and address as parameters.
* The first thing it does is generates a new ID for the contactID field.
*
* First name and last name are checked for null condition or blank fields. If either of
* those conditions exist, fill in the field with the phrase "NULL" so that something exists
* to protect data integrity while making it clear it is a placeholder.
* In both cases, if the first or last name is greater than 10 characters, truncate it
* so that only the first 10 characters are used.
*
* For the number field, if the phone number is not exactly 10 characters then fill it with
* the placeholder '5555555555'.
*
* Address is like first and last names. If it is blank or null, set it to "NULL".
* If it is more than 30 characters, truncate to the first 30 characters.
*/
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