package UserRegistration;

public class UC9 {

    public static void main(String[] args) {

        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc111@abc.com",
                "abc.xyz@bl.co.in"
        };

        for (String email : emails) {

            boolean result = email.matches(
                    "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$"
            );

            System.out.println(email + " : " + result);
        }
    }
}