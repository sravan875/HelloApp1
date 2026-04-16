package DAY1;

public class NameFromCommandLine {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No name provided!");
        } else {
            System.out.println("Your name is: " + args[0]);
        }
    }
}