package LearningProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerUC3Test2 {

    // Given EMPTY Mood
    // Should Throw MoodAnalysisException

    @Test
    public void givenEmptyMood_ShouldThrowException() {

        try {

            MoodAnalyzerUC3 mood =
                    new MoodAnalyzerUC3("");

            mood.analyseMood();

        } catch (MoodAnalysisException e) {

            assertEquals(
                    "Mood should not be Empty",
                    e.getMessage()
            );
        }
    }
}