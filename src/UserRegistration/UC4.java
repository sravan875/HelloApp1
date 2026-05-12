package UserRegistration;

public class UC4 {

    public static void main(String[] args) {

        String mobile = "91 9919819801";

        boolean result = mobile.matches("^[0-9]{2} [0-9]{10}$");

        System.out.println(result);
    }
}