package UserRegistration;

public class UC2 {

    public static void main(String[] args) {

        String lastName = "Kumar";

        boolean result = lastName.matches("[A-Z][a-z]{2,}");

        System.out.println(result);
    }
}