package LearningProblem;

import java.util.Scanner;

public class MoodAnalyzerUC1 {

    public String analyseMood(String message) {

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

        MoodAnalyzerUC1 mood = new MoodAnalyzerUC1();

        System.out.println(
                "Mood is : " + mood.analyseMood(message)
        );
    }
}