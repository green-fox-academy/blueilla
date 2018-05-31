import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void isAnagram() {
    String input1 = "asdfg";
    String input2 = "gfdsa";

    assertTrue(Anagram.isAnagram(input1, input2));

  }
}