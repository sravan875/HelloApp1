import java.util.regex.Pattern;

public class UC2 {
    public static boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
    }

    public static void main(String[] args) {
        System.out.println(validateLastName("Kumar"));
    }
}