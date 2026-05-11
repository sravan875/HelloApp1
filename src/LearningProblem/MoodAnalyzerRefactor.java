package LearningProblem;

import java.util.Scanner;

public class MoodAnalyzerRefactor {

    String message;

    // Default Constructor
    MoodAnalyzerRefactor() {

    }

    // Parameterized Constructor
    MoodAnalyzerRefactor(String message) {

        this.message = message;
    }

    // Analyse Mood Method
    public String analyseMood() {

        if (message.contains("Sad")) {

            return "SAD";
        }
        else {

            return "HAPPY";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mood Message: ");

        String message = sc.nextLine();

        MoodAnalyzerRefactor mood =
                new MoodAnalyzerRefactor(message);

        System.out.println(
                "Mood is : " + mood.analyseMood()
        );
    }
}