import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the distance between a and b!");
        int userInput1 = scanner.nextInt();
        System.out.println("That's " + userInput1 * 0.62 + " in miles.");

    }
}
