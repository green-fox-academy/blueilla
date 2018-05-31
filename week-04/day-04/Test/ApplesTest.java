import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  static Apples apples;
  String text;

  @BeforeClass
  public static void init() {
    apples = new Apples();
  }

  @Test
  public void should_return_the_textInput() {
    String inputString = "apple";
    String expectedResult = "apple";

    String result = apples.getApple(inputString);

    assertEquals(expectedResult, result);
  }
}