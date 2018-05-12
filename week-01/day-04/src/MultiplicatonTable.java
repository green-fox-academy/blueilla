import java.util.Scanner;

public class MultiplicatonTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A number please!");
        int userInput1 = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + userInput1 + " = " + userInput1 * i);
        }
    }
}
