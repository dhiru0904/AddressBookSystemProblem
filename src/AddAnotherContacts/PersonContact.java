package AddAnotherContacts;

import java.util.Iterator;
import java.util.List;

public class PersonContact {
            //Declaring variables for Address Book System
            private String firstName;
            private String lastName;
            private String address;
            private String city;
            private String state;
            private String zip;
            private String phoneNumber;
            private String email;

            public PersonContact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.city = city;
                this.state = state;
                this.zip = zip;
                this.phoneNumber = phoneNumber;
                this.email = email;
            }

            //Create toString methods to grab the values.

            @Override
            public String toString() {
                return "AddressBook{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", address='" + address + '\'' +
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zip='" + zip + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", email='" + email + '\'' +
                        '}';
            }

            //Printing contactDetails
            public void printContact(List<String> list) {
                System.out.println("Contact details are below.....\n");
                if(!list.isEmpty())
                {
                    Iterator it = list.iterator();
                    while (it.hasNext())
                    {
                        System.out.println(it.next());
                    }
                }
            }
        }

