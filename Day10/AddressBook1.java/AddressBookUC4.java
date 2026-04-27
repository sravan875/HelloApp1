void deleteContact(String name) {
    if (person.firstName.equals(name)) {
        person = null;
        System.out.println("Deleted!");
    }
}