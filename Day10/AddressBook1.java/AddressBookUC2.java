import java.util.Scanner;

class AddressBook {
    Contact person = new Contact();

    void addContact() {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        person.firstName = sc.nextLine();

        System.out.print("Last Name: ");
        person.lastName = sc.nextLine();

        System.out.print("City: ");
        person.city = sc.nextLine();

        System.out.println("Contact Added!");
    }

    void display() {
        System.out.println(person.firstName + " " + person.lastName + " - " + person.city);
    }
}