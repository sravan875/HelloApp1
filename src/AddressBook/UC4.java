// ========================= UC4.java =========================

package AddressBook;

public class UC4 {

    String firstName;

    public UC4(String firstName) {

        this.firstName = firstName;
    }

    // Delete Contact
    public void deleteContact() {

        firstName = null;

        System.out.println("Contact Deleted Successfully");
    }

    public static void main(String[] args) {

        UC4 person = new UC4("Rahul");

        person.deleteContact();
    }
}