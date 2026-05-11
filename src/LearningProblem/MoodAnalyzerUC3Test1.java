package LearningProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerUC3Test1 {

    // Given NULL Mood
    // Should Throw MoodAnalysisException

    @Test
    public void givenNullMood_ShouldThrowException() {

        try {

            MoodAnalyzerUC3 mood =
                    new MoodAnalyzerUC3(null);

            mood.analyseMood();

        } catch (MoodAnalysisException e) {

            assertEquals(
                    "Mood should not be Null",
                    e.getMessage()
            );
        }
    }
}