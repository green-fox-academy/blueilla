import java.util.Arrays;

public class Ex09 {

  public static void main(String[] args) {

    Character[] characters = new Character[]{'e', 'z', ' ', 'a', ' ', 'p', 'r', 'o', 'b', 'a'};
   String newString = getStringFromCharArray(characters);
    System.out.println(newString);
  }

  private static String getStringFromCharArray(Character[] characters) {
    return Arrays.stream(characters)
            .map(c -> Character.toString(c))
            .reduce((character, letter) -> character + letter)
            .get();
  }
}
//Write a Stream Expression to convert a char array to a string!