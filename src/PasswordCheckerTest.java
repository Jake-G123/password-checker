import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testExitInPassword() {
    // Arrange
    PasswordChecker testExit = new PasswordChecker(6, 12);
    // act
    String actual = testExit.describePasswordLength("exit123");
    // Assert
    assertEquals("medium", actual);
  }

  @Test
    public void testMinLength() {
        // Arrange
        PasswordChecker testExit = new PasswordChecker(6, 12);
        // act
        String actual = testExit.describePasswordLength("exit1");
        // Assert
        assertEquals("short", actual);
    }

  @Test
  public void testValidExit()
  {
      // Arrange
      PasswordChecker testExit = new PasswordChecker(6, 12);
      // act
      boolean actual = testExit.isBannedPassword("exit1");
      // Assert
      assertEquals(false, actual);
  } 

  @Test
  public void testInvalidExitDouble()
  {
      // Arrange
      PasswordChecker testExit = new PasswordChecker(6, 12);
      // act
      boolean actual = testExit.isBannedPassword("qwertyqwerty");
      // Assert
      assertEquals(false, actual);
  }
}
