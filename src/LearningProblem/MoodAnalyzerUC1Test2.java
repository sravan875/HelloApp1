package LearningProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerUC1Test2 {

    // TC 1.2
    // Given "I am in Any Mood" Should Return HAPPY

    @Test
    public void givenAnyMood_ShouldReturnHappy() {

        MoodAnalyzerUC1 mood =
                new MoodAnalyzerUC1();

        String result =
                mood.analyseMood("I am in Any Mood");

        assertEquals("HAPPY", result);
    }
}