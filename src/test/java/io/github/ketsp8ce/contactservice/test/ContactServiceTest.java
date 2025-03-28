

//Author Name: hunter Marx

//Date: 03/27/2025

//Course ID: CS32010813-M01

//Description: This is the unit tests for the contact service (ContactServiceTest)

package io.github.ketsp8ce.contactservice.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.github.ketsp8ce.contactservice.main.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {
	
	
@Test
@DisplayName("Test to Update First Name.")
@Order(1)
void testUpdateFirstName() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateFirstName("Sven", "0");
service.displayContactList();
assertEquals("Sven",service.getContact("0").getFirstName(), "First name was not updated.");
}


@Test
@DisplayName("Test to Update First Name.")
@Order(2)
void testUpdateLastName() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateLastName("Smort", "0");
service.displayContactList();
assertEquals("Smort",service.getContact("0").getLastName(), "Last name was not updated.");
}


@Test
@DisplayName("Test to Update Number.")
@Order(3)
void testUpdateNumber() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateNumber("7777779999", "0");
service.displayContactList();
assertEquals("7777779999",service.getContact("0").getNumber(), "Number was not updated.");
}

@Test
@DisplayName("Test to Update Address.")
@Order(4)
void testUpdateAddress() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateAddress("987 Ooga Booga St", "0");
service.displayContactList();
assertEquals("987 Ooga Booga St",service.getContact("0").getAddress(), "Address was not updated.");
}

}