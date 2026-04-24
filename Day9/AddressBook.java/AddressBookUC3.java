void editContact(String name) {
    for (Contact c : contacts) {
        if (c.firstName.equalsIgnoreCase(name)) {
            c.city = "UpdatedCity"; // example
            System.out.println("Contact Updated!");
            return;
        }
    }
    System.out.println("Contact not found!");
}