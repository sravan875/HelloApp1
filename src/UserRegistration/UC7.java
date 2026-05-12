package UserRegistration;

public class UC7 {

    public static void main(String[] args) {

        String password = "Password1";

        boolean result = password.matches(".*[0-9].*");

        System.out.println(result);
    }
}