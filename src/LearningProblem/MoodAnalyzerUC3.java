package LearningProblem;


import java.util.Scanner;

// Custom Exception Class
class MoodAnalysisException extends Exception {

    enum ExceptionType {
        EMPTY_MOOD,
        NULL_MOOD
    }

    ExceptionType type;

    MoodAnalysisException(ExceptionType type,
                          String message) {

        super(message);

        this.type = type;
    }
}

public class MoodAnalyzerUC3 {

    String message;

    // Constructor
    public MoodAnalyzerUC3(String message) {

        this.message = message;
    }

    // Analyse Mood Method
    public String analyseMood()
            throws MoodAnalysisException {

        try {

            // Empty Mood Check
            if (message.length() == 0) {

                throw new MoodAnalysisException(
                        MoodAnalysisException.ExceptionType.EMPTY_MOOD,
                        "Mood should not be Empty"
                );
            }

            // Sad Mood Check
            if (message.contains("Sad")) {

                return "SAD";
            }
            else {

                return "HAPPY";
            }

        } catch (NullPointerException e) {

            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.NULL_MOOD,
                    "Mood should not be Null"
            );
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mood Message: ");

        String message = sc.nextLine();

        try {

            MoodAnalyzerUC3 mood =
                    new MoodAnalyzerUC3(message);

            System.out.println(
                    "Mood is : " + mood.analyseMood()
            );

        } catch (MoodAnalysisException e) {

            System.out.println(e.getMessage());
        }
    }
}