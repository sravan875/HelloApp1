package PracticeProblem;

import java.util.Scanner;

class UserRegistrationException extends Exception {

    public UserRegistrationException(String message) {
        super(message);
    }
}

public class UC12 {

    // First Name Validation Method
    public static void validateFirstName(String firstName)
            throws UserRegistrationException {

        // First letter capital and minimum 3 characters
        if (!firstName.matches("^[A-Z][a-z]{2,}$")) {

            throw new UserRegistrationException("Invalid First Name");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        try {

            validateFirstName(firstName);

            System.out.println("Valid First Name");

        } catch (UserRegistrationException e) {

            System.out.println(e.getMessage());
        }
    }
}