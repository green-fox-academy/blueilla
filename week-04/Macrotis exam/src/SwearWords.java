import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.

    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(readFileContent("./content.txt"));
    System.out.println(familyFriendlizer("./content.txt", offensiveWords)); // should print out 17
  }

  public static int familyFriendlizer(String filePath, ArrayList<String> offensiveWords) {
    int removedWords = 0;
    List<String> fileContent = readFileContent("./content.txt");
    for (int i = 0; i < fileContent.size(); i++) {
      fileContent.remove("fuck");
    }
    System.out.println(fileContent);


    return removedWords;
  }

  public static List<String> readFileContent(String filePath) {
    List<String> fileRows = new ArrayList<>();
    try {
      fileRows = Files.readAllLines(Paths.get(filePath));
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return fileRows;
  }
}
