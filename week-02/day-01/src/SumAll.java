public class SumAll {

  public static void main(String[] args) {

    int[] numbers = {3, 4, 5, 6, 7};
    System.out.println(sumTheNumbers(numbers));
  }

  public static int sumTheNumbers(int[] numbers) {
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`