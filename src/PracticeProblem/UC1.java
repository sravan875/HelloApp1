package PracticeProblem;

import java.util.regex.Pattern;

public class UC1 {
    public static boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }

    public static void main(String[] args) {
        System.out.println(validateFirstName("Charan"));
    }
}