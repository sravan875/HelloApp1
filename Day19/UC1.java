package Day19;

import java.util.regex.*;

public class UC1 {
    public static void main(String[] args) {

        String firstName = "Charan";

        String regex = "^[A-Z][a-z]{2,}$";

        boolean result = Pattern.matches(regex, firstName);

        System.out.println(result);
    }
}