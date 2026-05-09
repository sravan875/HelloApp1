package Day19;

import java.util.regex.*;

public class UC2 {
    public static void main(String[] args) {

        String lastName = "Kumar";

        String regex = "^[A-Z][a-z]{2,}$";

        boolean result = Pattern.matches(regex, lastName);

        System.out.println(result);
    }
}