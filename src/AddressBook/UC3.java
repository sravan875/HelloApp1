package AddressBook;

public class UC3 {

    String firstName;
    String city;

    // Constructor
    public UC3(String firstName, String city) {

        this.firstName = firstName;
        this.city = city;
    }

    // Edit Contact
    public void editContact(String newCity) {

        city = newCity;

        System.out.println("Contact Edited Successfully");
    }

    // Display
    public void display() {

        System.out.println(firstName);
        System.out.println(city);
    }

    public static void main(String[] args) {

        UC3 person = new UC3(
                "Rahul",
                "Chennai"
        );

        person.editContact("Bangalore");

        person.display();
    }
}