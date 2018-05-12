import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers!");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        if (userInput1 >= userInput2) {
            System.out.println("Second number should be bigger!");
        } else if (userInput1 < userInput2) {
            for (int i = userInput1; i < userInput2; i++) {
                System.out.println(i);
            }

        }
    }
}

