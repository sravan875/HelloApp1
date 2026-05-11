package LearningProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerRefactorTest1 {

    // Repeat TC 1.1
    // Given "I am in Sad Mood" in Constructor
    // Should Return SAD

    @Test
    public void givenSadMoodInConstructor_ShouldReturnSad() {

        MoodAnalyzerRefactor mood =
                new MoodAnalyzerRefactor("I am in Sad Mood");

        String result = mood.analyseMood();

        assertEquals("SAD", result);
    }
}