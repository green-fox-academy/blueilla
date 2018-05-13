import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me two numbers, I tell you which one is bigger!");
        int Userinput = scanner.nextInt();
        int Userinput2 = scanner.nextInt();

        if (Userinput == Userinput2) {
            System.out.println("These two are equal!");
        } else if (Userinput > Userinput2) {
        System.out.println("This one is bigger: " + Userinput);
        } else {
            System.out.println("This one is bigger: " + Userinput2);
        }
    }
}
