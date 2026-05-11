import java.util.regex.Pattern;

public class UC3 {
    public static boolean validateEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$", email);
    }

    public static void main(String[] args) {
        System.out.println(validateEmail("abc.xyz@bl.co.in"));
    }
}