import java.util.Arrays;

public class Ex05 {

  public static void main(String[] args) {
    String text = "WorDwOrd is with some UpperCAse charaCteRs";
    System.out.println(getTheUppercaseChars(text));
  }

  private static String getTheUppercaseChars(String text) {
    String[] splittedText = text.split("");
    return Arrays.stream(splittedText)
            .map(c -> c.charAt(0))
            .filter(Character::isUpperCase)
            .map(c -> Character.toString(c))
            .reduce((uppercase, letter) -> uppercase + letter)
            .get();

  }
}
