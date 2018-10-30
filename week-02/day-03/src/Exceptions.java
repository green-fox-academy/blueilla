import java.util.Scanner;

public class Exceptions {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int myDivisor = scanner.nextInt();
    divider(myDivisor);
  }

  public static int divider(int divisor) {
    int result = 0;
    try {
      result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("You cannot divide by zero YOU DUMMY!");
    }
    return result;
  }
}

