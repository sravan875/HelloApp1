package UserRegistration;

interface UserValidation {

    boolean validate(String value);
}

public class UC13 {

    public static void main(String[] args) {

        UserValidation firstNameValidator =
                name -> name.matches("[A-Z][a-z]{2,}");

        UserValidation emailValidator =
                email -> email.matches(
                        "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$"
                );

        System.out.println(firstNameValidator.validate("Rahul"));

        System.out.println(emailValidator.validate("abc.xyz@bl.co.in"));
    }
}