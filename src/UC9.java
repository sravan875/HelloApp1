public class UC9 {

    public static boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");
    }

    public static void main(String[] args) {

        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au"
        };

        for(String email : emails) {
            System.out.println(email + " : " + validateEmail(email));
        }
    }
}