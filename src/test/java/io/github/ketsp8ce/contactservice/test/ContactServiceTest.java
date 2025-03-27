package io.github.ketsp8ce.contactservice.test;

//Author Name: hunter Marx

//Date: 03/27/2025

//Course ID: CS32010813-M01

//Description: This is the unit tests for the contact service (ContactServiceTest)


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

/*
* The following tests exercise the ContactService class.
* In each test, a new service is created with default values for each field.
* Then the service is requested to make some change to the list of contacts and the result
* is tested to ensure the actual field matches what is expected.
*
* Because each contact that gets created has a new automatically assigned contactID,
* and the tests are run based on that contactID, the order in which the tests are run depend
* on the value of each contactID. Therefore, the @Order annotation is used to keep the tests
* in a specific order.
*
* For evidence that the contactID is correct for each test, uncomment the service.displayContactList();
* prior to each assertion so that the records are displayed on the console for error checking.
*/
@Test
@DisplayName("Test to Update First Name.")
@Order(1)
void testUpdateFirstName() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateFirstName("Sven", "0");
//service.displayContactList();
assertEquals("Sven",service.getContact("0").getFirstName(), "First name was not updated.");
}

// Now it's your turn to finish creating the code 