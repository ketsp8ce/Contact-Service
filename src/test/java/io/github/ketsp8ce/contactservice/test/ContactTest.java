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
/*
* The following tests exercise the Contact class.
* The first 5 tests to make sure the field does not become longer than the constraint
* (10 characters for first and last name, exactly 10 characters for phone number,
* and 30 characters for the address).
* The last 4 tests ensure that each field is not null.
* ContactID is not tested for being not null because there isn't a way to create
* a contact with a null contactID. Likewise it is not tested for being non-updateable
* because there is no way to update it.
*/
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
if(contact.getAddress().length() > 10) {
fail("Address has more than 10 characters.");
}
}

}

// Now it's your turn to finish creating the code 

