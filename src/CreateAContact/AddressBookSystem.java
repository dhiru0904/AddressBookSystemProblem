package CreateAContact;

public class AddressBookSystem {
    //Default Constructor
    public AddressBookSystem()
    {

        System.out.println("Welcome to Address Book Program .....**");
    }

    public static void main(String[] args) {

        //Initialize ObjectAddressBook
        AddressBookSystem obj = new AddressBookSystem();

        //Calling Encapsulated Class object
        ContactPerson addressBook = new ContactPerson("Dhiraj","Deore","Indave","Dhule",
                "Maharastra","425408","7709684431","dhirajdevre4@gmail.com");

        System.out.print("\n"+addressBook.toString());
    }
}
