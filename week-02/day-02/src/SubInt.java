import java.util.ArrayList;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indexes of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list

    //  Example:
    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
    //  should print: '[]'
  }

  private static ArrayList<Integer> subInt(int number, int[] numbers) {
    ArrayList<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      if (String.valueOf(numbers[i]).contains(String.valueOf(number))) {
        indexes.add(i);
      }
    }
    return indexes;
  }
}
