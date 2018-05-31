import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

 static ArrayList<Integer> testList;
 static Sum sum;

  @Before
  public void init () {
    testList = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 7, 7));
  }

  @Test
  public void should_return_the_sum_of_the_list_element() {
    Sum sum = new Sum();
    int expectedResult = 26;
    int result = sum.getSum(testList);
    assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_zero_when_empty_list() {
    int expectedResult = 0;
    int result = sum.getSum(testList);

    assertEquals(expectedResult, result);
  }
}