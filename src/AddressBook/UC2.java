package AddressBook;

public class UC2 {

    String firstName;
    String lastName;
    String city;

    // Constructor
    public UC2(String firstName, String lastName, String city) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    // Add Contact
    public void addContact() {

        System.out.println("Contact Added Successfully");
    }

    // Display Contact
    public void display() {

        System.out.println(firstName + " " + lastName);
        System.out.println(city);
    }

    public static void main(String[] args) {

        UC2 person = new UC2(
                "Rahul",
                "Kumar",
                "Chennai"
        );

        person.addContact();

        person.display();
    }
}