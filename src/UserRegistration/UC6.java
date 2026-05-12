package UserRegistration;

public class UC6 {

    public static void main(String[] args) {

        String password = "Password1";

        boolean result = password.matches(".*[A-Z].*");

        System.out.println(result);
    }
}