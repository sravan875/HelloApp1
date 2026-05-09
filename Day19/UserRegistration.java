package Day19;

import java.util.regex.*;

public class UserRegistration {

    // UC1 - First Name
    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    // UC2 - Last Name
    public static boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return Pattern.matches(regex, lastName);
    }

    // UC3 - Email Validation
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }

    // UC4 - Mobile Number
    public static boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }

    // UC5 - Password Rule 1 (Minimum 8 Characters)
    public static boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return Pattern.matches(regex, password);
    }

    // UC6 - Password Rule 2 (At least 1 Uppercase)
    public static boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
        return Pattern.matches(regex, password);
    }

    // UC7 - Password Rule 3 (At least 1 Numeric Number)
    public static boolean validatePasswordRule3(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }

    // UC8 - Password Rule 4 (Exactly 1 Special Character)
    public static boolean validatePasswordRule4(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }

    // UC9 - Email Samples Validation
    public static void validateEmailSamples() {

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("\nValid Emails:");
        for (String email : validEmails) {
            System.out.println(email + " : " + validateEmail(email));
        }

        System.out.println("\nInvalid Emails:");
        for (String email : invalidEmails) {
            System.out.println(email + " : " + validateEmail(email));
        }
    }

    public static void main(String[] args) {

        // UC1
        System.out.println("UC1 First Name: " +
                validateFirstName("Charan"));

        // UC2
        System.out.println("UC2 Last Name: " +
                validateLastName("Kumar"));

        // UC3
        System.out.println("UC3 Email: " +
                validateEmail("abc.xyz@bl.co.in"));

        // UC4
        System.out.println("UC4 Mobile: " +
                validateMobile("91 9919819801"));

        // UC5
        System.out.println("UC5 Password Rule1: " +
                validatePasswordRule1("Password"));

        // UC6
        System.out.println("UC6 Password Rule2: " +
                validatePasswordRule2("Password"));

        // UC7
        System.out.println("UC7 Password Rule3: " +
                validatePasswordRule3("Password1"));

        // UC8
        System.out.println("UC8 Password Rule4: " +
                validatePasswordRule4("Password@1"));

        // UC9
        validateEmailSamples();
    }
}