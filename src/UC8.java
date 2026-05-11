import java.util.regex.Pattern;

public class UC8 {
    public static boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$", password);
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("Password1@"));
    }
}