void editContact(String name) {
    if (person.firstName.equals(name)) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new city: ");
        person.city = sc.nextLine();
    }
}