package LearningProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerUC1Test1 {

    // TC 1.1
    // Given "I am in Sad Mood" Should Return SAD

    @Test
    public void givenSadMood_ShouldReturnSad() {

        MoodAnalyzerUC1 mood =
                new MoodAnalyzerUC1();

        String result =
                mood.analyseMood("I am in Sad Mood");

        assertEquals("SAD", result);
    }
}