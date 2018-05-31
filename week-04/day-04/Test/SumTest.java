import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {


  @Test
  public void should_return_the_sum_of_the_list_element() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 7, 7));
    int expectedResult = 26;
    int result = Sum.getSum(testList);
    assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_zero_when_empty_list() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList());
    int expectedResult = 0;
    int result = Sum.getSum(testList);

      assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_the_element_if_theres_one_element_in_the_list() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1));
    int expectedResult = 1;
    int result = Sum.getSum(testList);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_return_0_when_is_null() {
    ArrayList<Integer> testList = new ArrayList<>(null);
    int expectedResult = 0;
    int result = Sum.getSum(testList);

    assertEquals(expectedResult, result);
  }
}