package Day19;

import java.util.regex.*;

public class UC8 {
    public static void main(String[] args) {

        String password = "Password@1";

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$";

        boolean result = Pattern.matches(regex, password);

        System.out.println(result);
    }
}
