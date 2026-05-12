package UserRegistration;

public class UC5 {

    public static void main(String[] args) {

        String password = "password1";

        boolean result = password.matches(".{8,}");

        System.out.println(result);
    }
}