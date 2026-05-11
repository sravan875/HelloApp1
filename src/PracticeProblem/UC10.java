package PracticeProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC10 {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        assertTrue("Charan".matches("^[A-Z][a-z]{2,}$"));
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        assertFalse("ch".matches("^[A-Z][a-z]{2,}$"));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        assertTrue("abc.xyz@bl.co.in".matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$"));
    }

    @Test
    public void givenMobile_WhenValid_ShouldReturnTrue() {
        assertTrue("91 9919819801".matches("^[0-9]{2} [0-9]{10}$"));
    }
}