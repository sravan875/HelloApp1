package Day19;

import java.util.regex.*;

public class UC3 {
    public static void main(String[] args) {

        String email = "abc.xyz@bl.co.in";

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        boolean result = Pattern.matches(regex, email);

        System.out.println(result);
    }
}
