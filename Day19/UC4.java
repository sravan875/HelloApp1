package Day19;

import java.util.regex.*;

public class UC4 {
    public static void main(String[] args) {

        String mobile = "91 9919819801";

        String regex = "^[0-9]{2} [0-9]{10}$";

        boolean result = Pattern.matches(regex, mobile);

        System.out.println(result);
    }
}