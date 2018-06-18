import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex08 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    Map<Integer, Long> numberFrequency = getNumberFrequency(numbers);
    System.out.println(numberFrequency);
  }

  private static Map<Integer, Long> getNumberFrequency(ArrayList<Integer> numbers) {
    return numbers.stream()
            .collect(Collectors.groupingBy(number -> number, Collectors.counting()));
  }
}
