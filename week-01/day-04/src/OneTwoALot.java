import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number!");
        int userInput = scanner.nextInt();

        if (userInput < 0) {
            System.out.println("Not enough");
        } else if (userInput == 1) {
            System.out.println("One");
        } else if (userInput == 2) {
            System.out.println("Two");
        } else if (userInput > 2) {
            System.out.println("A lot");
        }
    }
}
