import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;

  @Test
  public void should_return_the_sum_of_the_list_element() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 7, 7));
    Sum sum = new Sum();
    int expectedResult = 26;
    int result = sum.getSum(testList);
    assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_zero_when_empty_list() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList());
    int expectedResult = 0;
    int result = sum.getSum(testList);

      assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_the_element_if_theres_one_element_in_the_list() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1));
    int expectedResult = 1;
    int result = sum.getSum(testList);

    assertEquals(expectedResult, result);
  }
}