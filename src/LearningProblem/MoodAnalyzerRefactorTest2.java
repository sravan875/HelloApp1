package LearningProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerRefactorTest2 {

    // Repeat TC 1.2
    // Given "I am in Happy Mood" in Constructor
    // Should Return HAPPY

    @Test
    public void givenHappyMoodInConstructor_ShouldReturnHappy() {

        MoodAnalyzerRefactor mood =
                new MoodAnalyzerRefactor("I am in Happy Mood");

        String result = mood.analyseMood();

        assertEquals("HAPPY", result);
    }
}