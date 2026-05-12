package UserRegistration;

public class UC1 {

    public static void main(String[] args) {

        String firstName = "Rahul";

        boolean result = firstName.matches("[A-Z][a-z]{2,}");

        System.out.println(result);
    }
}