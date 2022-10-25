package AddAnotherContacts;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
            //Create an arraylist.
            private static ArrayList<String> contactDetails = new ArrayList<>();

            //Default Constructor
            public AddressBookSystem()
            {
                System.out.println("Welcome to Address Book Program .....**");
            }

            public static void main(String[] args) {

                //Initialize Object
                AddressBookSystem obj = new AddressBookSystem();

                //Calling Encapsulated Class object
                PersonContact a = new PersonContact("Dhiraj","Deore","Indave","Dhule",
                        "Maharastra","425408","7709684431","dhirajdevre4@gmail.com");

                //Adding another contact
                System.out.println();
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the contact details.............");
                System.out.println("Enter the first name:");
                String firstName = scan.nextLine();
                System.out.println("Enter the last name:");
                String lastName = scan.nextLine();
                System.out.println("Enter the address:");
                String address = scan.nextLine();
                System.out.println("Enter the city:");
                String city = scan.nextLine();
                System.out.println("Enter the state:");
                String state = scan.nextLine();
                System.out.println("Enter the zip code:");
                String zip = scan.nextLine();
                System.out.println("Enter the phone no:");
                String phoneNumber = scan.nextLine();
                System.out.println("Enter the email:");
                String email = scan.nextLine();
                scan.close();
                PersonContact b = new PersonContact(firstName, lastName, address, city, state,zip,phoneNumber,email);

                //Parsing the object to create a list
                contactDetails.add(a.toString());
                contactDetails.add(b.toString());

                //Printing contact details
                a.printContact(contactDetails);
            }
        }

