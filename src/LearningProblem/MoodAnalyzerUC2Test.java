package LearningProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerUC2Test {

    // TC 2.1
    // Given NULL Mood Should Return HAPPY

    @Test
    public void givenNullMood_ShouldReturnHappy() {

        MoodAnalyzerUC2 mood =
                new MoodAnalyzerUC2(null);

        String result = mood.analyseMood();

        assertEquals("HAPPY", result);
    }
}