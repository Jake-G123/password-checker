import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

@Test
    public void testMinLength() {
        // Arrange
        PasswordChecker testExit = new PasswordChecker(6, 12);
        // act
        String actual = testExit.describePasswordLength("exit1");
        // Assert
        assertEquals("short", actual);
    }
}
