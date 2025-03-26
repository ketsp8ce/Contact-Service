

package io.github.ketsp8ce.contactservice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.github.ketsp8ce.contactservice.Contact;

class ContactTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("xxxxxx", "Carina", "Morjan", "3333333333", "888 ooga booga");
		});
	}

}

/*
//unit tests for contact
package io.github.ketsp8ce.contactservice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	class ContactTest {
	
	@Test
	void testContactTest(){
		ContactTest contactTest = new ContactTest("xxxxxx", "Hunter", "Marx", "8088888888", "111 1rst St");
		assertTrue(Contact.getContactId().equals("xxxxxx"));
		assertTrue(Contact.getFirstName().equals("Hunter"));
		assertTrue(Contact.getLastName().equals("Marx"));
		assertTrue(Contact.getPhone().equals("8088888888"));
		assertTrue(Contact.getAddress().equals("111 1rst St"));
		
	}

}
*/