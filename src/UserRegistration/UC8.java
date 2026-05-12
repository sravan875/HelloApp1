package UserRegistration;

public class UC8 {

    public static void main(String[] args) {

        String password = "Password@1";

        boolean result = password.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*]*[@#$%^&*][^@#$%^&*]*$).{8,}$"
        );

        System.out.println(result);
    }
}