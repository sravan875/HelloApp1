import java.util.regex.Pattern;

public class UC5 {
    public static boolean validatePassword(String password) {
        return Pattern.matches("^.{8,}$", password);
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("password"));
    }
}