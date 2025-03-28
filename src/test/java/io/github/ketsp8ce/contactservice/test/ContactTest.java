//Author Name: Hunter Marx

//Date: 03/27/2025

//Course ID: CS320-10813-M01

//Description: This is the unit tests for the contact class (ContactTest).

package io.github.ketsp8ce.contactservice.test;

import org.junit.jupiter.api.Test;

import io.github.ketsp8ce.contactservice.main.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

@Test
@DisplayName("Contact ID cannot have more than 10 characters")
void testContactIDWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName","LastName","PhoneNumbr","Address");
if(contact.getContactID().length() > 10) {
fail("Contact ID has more than 10 characters.");
}
}

@Test
@DisplayName("Contact First Name cannot have more than 10 characters")
void testContactFirstNameWithMoreThanTenCharacters() {
Contact contact = new Contact("OllyOllyOxenFree","LastName","PhoneNumbr","Address");
if(contact.getFirstName().length() > 10) {
fail("First Name has more than 10 characters.");
}
}

@Test
@DisplayName("Contact Last Name cannot have more than 10 characters")
void testContactLastNameWithMoreThanTenCharacters() {
Contact contact = new Contact("firstName","supercalifragalisticexpialidosious","PhoneNumbr","Address");
if(contact.getLastName().length() > 10) {
fail("Last Name has more than 10 characters.");
}
}

@Test
@DisplayName("Contact phone cannot have more than 10 characters")
void testContactPhoneWithMoreThanTenCharacters() {
Contact contact = new Contact("firstName","lastName","111111111111111111","Address");
if(contact.getNumber().length() > 10) {
fail("Number has more than 10 characters.");
}
}

@Test
@DisplayName("Contact adress cannot have more than 10 characters")
void testContactAddressWithMoreThanTenCharacters() {
Contact contact = new Contact("firstName","lastName","PhoneNumbr","6666666666 spookeydookeyookie st, HIILHIILHIILHIILHIIL, 1234567890987654321");
if(contact.getAddress().length() > 30) {
fail("Address has more than 10 characters.");
}
}

@Test
@DisplayName("Contact firstName cannot be null")
void testContactFirstNameNotNull() {
Contact contact = new Contact(null,"LastName","PhoneNumbr","Address");
if(contact.getFirstName() == null) {
fail("Contact firstName is null")	;			
}
}

@Test
@DisplayName("Contact firstName cannot be null")
void testContactLastNameNotNull() {
Contact contact = new Contact("firstName",null,"PhoneNumbr","Address");
if(contact.getLastName() == null) {
fail("Contact lastName is null")	;			
}
}

@Test
@DisplayName("Contact number cannot be null")
void testContactNumberNotNull() {
Contact contact = new Contact("firstName","lastName",null,"Address");
if(contact.getNumber() == null) {
fail("Contact lastName is null")	;			
}
}

@Test
@DisplayName("Contact address cannot be null")
void testContactAddressNotNull() {
Contact contact = new Contact("firstName","lastName", "PhoneNumbr",null);
if(contact.getAddress() == null) {
fail("Contact lastName is null")	;			
}
}


}
