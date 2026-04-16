public class SumArguments {

    public static void main(String[] args) {

<<<<<<< HEAD
        // If no arguments passed
=======
>>>>>>> feature/day2
        if (args.length == 0) {
            System.out.println("No command-line arguments provided!");
            return;
        }

        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Invalid inputs = " + invalidCount);
    }
}