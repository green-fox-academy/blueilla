import java.util.ArrayList;
import java.util.List;

public class Sum {
  
  public int getSum(ArrayList<Integer> numbers) {
    if (numbers == null) {
      return 0;
    }
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
