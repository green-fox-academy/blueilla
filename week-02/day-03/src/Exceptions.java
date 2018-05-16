import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myDivisor = scanner.nextInt();
        int result = 0;
        divider(myDivisor, result);
    }

    public static int divider(int divisor, int result) {
        try {
            result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        } return result;
    }
}

