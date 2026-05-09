package Day19;

import java.util.regex.*;

public class UC6 {
    public static void main(String[] args) {

        String password = "Password";

        String regex = "^(?=.*[A-Z]).{8,}$";

        boolean result = Pattern.matches(regex, password);

        System.out.println(result);
    }
}