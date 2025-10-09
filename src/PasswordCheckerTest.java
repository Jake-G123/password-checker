import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

@Test
    public void testRepeatedLetterInStringFrequency() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Act
        int actual = counter.getFrequency('l');
        // Assert
        assertEquals(2, actual);
    }

@Test
    public void testExitInPassword() {
        // Arrange
        PasswordChecker testExit = new PasswordChecker()
    }


}
