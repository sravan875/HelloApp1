package UserRegistration;

class InvalidUserException extends Exception {

    public InvalidUserException(String message) {

        super(message);
    }
}

public class UC12 {

    public static void main(String[] args) {

        try {

            String firstName = "ra";

            if (!firstName.matches("[A-Z][a-z]{2,}")) {

                throw new InvalidUserException("Invalid First Name");
            }

        } catch (InvalidUserException e) {

            System.out.println(e.getMessage());
        }
    }
}