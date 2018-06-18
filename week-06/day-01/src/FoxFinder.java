import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FoxFinder {

  static ArrayList<Fox> foxes = new ArrayList<>();

  public static void main(String[] args) {


    Fox fox1 = new Fox("pisti", "pallida", "green");
    Fox fox2 = new Fox("yoli", "macrotis", "red");
    Fox fox3 = new Fox("feri", "rabbit", "green");
    Fox fox4 = new Fox("agi", "pallida", "yellow");
    Fox fox5 = new Fox("gabi", "pallida", "green");

    foxes.addAll(Arrays.asList(fox1, fox2, fox3, fox4, fox5));

    System.out.println(Objects.toString(getFilteredFoxes(foxes)));

  }

  private static List<Fox> getFilteredFoxes(List<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.getColor().startsWith("g"))
            .filter(fox -> fox.getType().startsWith("p"))
            .collect(Collectors.toList());
  }
}
