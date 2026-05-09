package Day19;

import java.util.regex.*;

public class UC7 {
    public static void main(String[] args) {

        String password = "Password1";

        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

        boolean result = Pattern.matches(regex, password);

        System.out.println(result);
    }
}
