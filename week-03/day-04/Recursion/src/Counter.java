public class Counter {

    public static void main(String[] args) {
        int countNumber = countNumbersFunction(20);
        System.out.println(countNumber);

    }

    public static int countNumbersFunction(int n) {
      if (n == 1) {
          return 1;
      } else {
          System.out.println(n);
          return countNumbersFunction(n - 1);
      }
    }
}
