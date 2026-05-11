import java.util.regex.Pattern;

public class UC4 {
    public static boolean validateMobile(String mobile) {
        return Pattern.matches("^[0-9]{2} [0-9]{10}$", mobile);
    }

    public static void main(String[] args) {
        System.out.println(validateMobile("91 9919819801"));
    }
}