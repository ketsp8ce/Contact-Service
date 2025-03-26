//data model class

package io.github.ketsp8ce.contactservice.main;

public class Contact {

	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.
		//The contact ID shall not be null and shall not be updatable.

		private final String contactId;
		private String firstName;
		private String lastName;
		private String phone;
		private String address;
		
	//constructor
		public Contact(String contactId, String firstName, String lastName, String phone, String address) {
			
			if (contactId == null || contactId.length() > 10) {
				throw new IllegalArgumentException("invalid contact ID");
			}
			if (firstName == null || firstName.length() >10) {
				throw new IllegalArgumentException("invalid first name");
			}
			if (lastName == null || lastName.length() > 10) {
				throw new IllegalArgumentException("invalid last name");
			}
			if (phone == null || phone.length() > 10) {
				throw new IllegalArgumentException("invalid phone number");
			}
			if (address == null || address.length() > 30) {
				throw new IllegalArgumentException("invalid address");
			}
			this.contactId = contactId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
		}
		
	//getters
		public String getContactId() {
			return contactId;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}
		
	//setters (only field which are updatable)
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
}
