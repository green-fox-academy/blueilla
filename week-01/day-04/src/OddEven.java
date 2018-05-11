import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number!");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 1) {
            System.out.println("That's an odd!");
        } else {
            System.out.println("That's even!");
        }
    }
}
