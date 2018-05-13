import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my number!");
        int userInput = scanner.nextInt();
        int myNumber = 8;

        while (userInput != myNumber) {

            if (userInput > myNumber) {
                System.out.println("My number is lower, guess again!");
                userInput = scanner.nextInt();
            } else {
                System.out.println("My number is higher, guess again!");
                userInput = scanner.nextInt();
            }
        }
        System.out.println("Congrats, you got my number!!!");
    }
}
