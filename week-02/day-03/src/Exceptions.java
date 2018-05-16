import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }
}
