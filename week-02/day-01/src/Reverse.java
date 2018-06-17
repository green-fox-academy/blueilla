import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {

    int[] aj = {2, 3, 4, 5, 6};
    System.out.println(getReversedList(aj));
  }

  public static String getReversedList(int[] aj) {
    if (aj == null) {
      return "its null";
    }
    if (aj.length == 0) {
      return "sorry, its empty";
    }

    for(int i = 0; i < aj.length / 2; i++) {
      int temp = aj[i];
      aj[i] = aj[aj.length - i - 1];
      aj[aj.length - i - 1] = temp;
    }
    return Arrays.toString(aj);
  }
}

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`