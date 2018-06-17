import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ReverseTest {

  @Test
  void should_return_reverse_list() {
    int[] testlist1 = new int[] {1, 2, 3, 4};

    String expectedresult = "[4, 3, 2, 1]";

    String result1 = Reverse.getReversedList(testlist1);
    assertEquals(expectedresult, result1);
  }

 /* @Test
  void should_return_itsnull_when_null_is_given(){
    int[] testlist2 = null;

    String expectedResult = "its null";

    String result2 = Reverse.getReversedList(testlist2);
    assertEquals(expectedResult, testlist2);
  }

 /* @Test
  void should_return_sorry_when_its_empty_array(){
    int[] testlist = new int[] {};

    String expectedresult = "sorry, its empty";

    String result = Reverse.getReversedList(testlist);
    assertEquals(expectedresult, testlist);
  } */
}