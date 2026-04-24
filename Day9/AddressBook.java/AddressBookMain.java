class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    void display() {
        System.out.println(firstName + " " + lastName);
        System.out.println(address + ", " + city + ", " + state + " - " + zip);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Contact person = new Contact();

        person.firstName = "John";
        person.lastName = "Doe";
        person.address = "Street 1";
        person.city = "Chennai";
        person.state = "TN";
        person.zip = "600001";
        person.phoneNumber = "9876543210";
        person.email = "john@gmail.com";

        person.display();
    }
}