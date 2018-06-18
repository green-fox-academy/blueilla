
import java.util.Map;
import java.util.stream.Collectors;



public class Ex07 {

  public static void main(String[] args) {
    String text = "Count how many times has this String each character";
    Map <Character, Long> characterFrequency = getCharacterFrequency(text);
    System.out.println(characterFrequency);
  }

  private static Map<Character, Long> getCharacterFrequency(String text) {
    return text.chars()
            .mapToObj(c ->(char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }
}
