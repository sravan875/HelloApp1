package LearningProblem;

import java.util.Scanner;

public class MoodAnalyzerUC2 {

    String message;

    // Constructor
    public MoodAnalyzerUC2(String message) {

        this.message = message;
    }

    // Analyse Mood Method
    public String analyseMood() {

        try {

            if (message.contains("Sad")) {

                return "SAD";
            }
            else {

                return "HAPPY";
            }

        } catch (NullPointerException e) {

            return "HAPPY";
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mood Message: ");

        String message = sc.nextLine();

        MoodAnalyzerUC2 mood =
                new MoodAnalyzerUC2(message);

        System.out.println(
                "Mood is : " + mood.analyseMood()
        );
    }
}