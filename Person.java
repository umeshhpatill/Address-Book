package addressbook;

import java.util.Scanner;

public class Person extends Address {
		private String firstName;
		private String lastName;
		private long mobileNumber;
		Address address=new Address();

		
		
		
		public void setFristName(String firstName) {
			this.firstName = firstName;
			
		}
		
		public String getFristName() {
			return firstName;
			
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
			
		}
		
		public long getMobileNumber() {
			return mobileNumber;
		}
		
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public Address getAddress(Address address) {
			return address;
		}

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
					+ ", address=" + address + "]";
		}

		
	}

		