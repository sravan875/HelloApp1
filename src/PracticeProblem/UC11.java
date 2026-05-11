package PracticeProblem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class UC11 {

    public boolean validateEmail(String email) {
        return email.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com"
    })

    public void givenEmails_WhenValid_ShouldReturnTrue(String email) {
        assertTrue(validateEmail(email));
    }
}