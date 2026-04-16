public class NameFromCommandLine {

    public static void main(String[] args) {

        // Check if user passed any argument
        if (args.length == 0) {
            System.out.println("No name provided!");
        } else {
            System.out.println("Your name is: " + args[0]);
        }
    }
}