import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        System.out.println("Hello User!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userInput1 = scanner.nextLine();
        System.out.println("Welcome " + userInput1 + "! How old are You?");

        int userInput2 = scanner.nextInt();
        System.out.println("Great age!");
    }
}


