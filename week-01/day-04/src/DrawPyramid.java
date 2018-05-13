import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many line the pyramid shuold have!");
        int userInput = scanner.nextInt();
        for (int j = 1; j <= userInput ; j++) {
            for (int i = 1; i <= (userInput + (userInput - 1)) ; i++) {
                if (((userInput - j) < i) && (i < (userInput + j)))  {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
