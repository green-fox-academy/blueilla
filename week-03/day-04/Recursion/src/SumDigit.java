public class SumDigit {
    public static void main(String[] args) {
        int sumDigit = sumDigitFunction(16510);
        System.out.println(sumDigit);

    }

    private static int sumDigitFunction(int number){
        int sum = 0;
        if (number > 0) {
          return sum = number % 10 + sumDigitFunction(number / 10);
        } else {
            return sum;
        }
    }
}
