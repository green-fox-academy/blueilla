



import java.util.Scanner;

public class DrawTriangleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many line the triangle should have!");
        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}