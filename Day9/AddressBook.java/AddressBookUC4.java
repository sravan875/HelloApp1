void deleteContact(String name) {
    for (Contact c : contacts) {
        if (c.firstName.equalsIgnoreCase(name)) {
            contacts.remove(c);
            System.out.println("Contact Deleted!");
            return;
        }
    }
    System.out.println("Contact not found!");
}