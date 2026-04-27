public class UC1 {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random() * 2);
        if (isPresent == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}