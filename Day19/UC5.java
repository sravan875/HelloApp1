package Day19;

import java.util.regex.*;

public class UC5 {
    public static void main(String[] args) {

        String password = "Password";

        String regex = "^.{8,}$";

        boolean result = Pattern.matches(regex, password);

        System.out.println(result);
    }
}
