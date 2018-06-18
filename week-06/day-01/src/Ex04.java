import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(Arrays.toString(getNumbersWhereSquaredValueIsMoreThanTwenty(numbers)));
  }

  private static int[] getNumbersWhereSquaredValueIsMoreThanTwenty(ArrayList<Integer> numbers) {
    return numbers.stream()
            .mapToInt(n -> n * n)
            .filter(n -> n > 20)
            .toArray();
  }
}
