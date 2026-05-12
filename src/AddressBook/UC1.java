package AddressBook;

public class UC1 {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    // Constructor
    public UC1(String firstName, String lastName,
               String address, String city,
               String state, String zip,
               String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Method
    public void display() {

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Address    : " + address);
        System.out.println("City       : " + city);
        System.out.println("State      : " + state);
        System.out.println("Zip        : " + zip);
        System.out.println("Phone No   : " + phoneNumber);
        System.out.println("Email      : " + email);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        UC1 person = new UC1(
                "Rahul",
                "Kumar",
                "Street 1",
                "Chennai",
                "Tamil Nadu",
                "600001",
                "9876543210",
                "rahul@gmail.com"
        );

        person.display();
    }
}