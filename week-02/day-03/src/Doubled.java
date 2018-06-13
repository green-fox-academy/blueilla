import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    List<String> fileContent = getFileContent("duplicated_chars.txt");
    String decryptedText = getdecryptedtext(fileContent);
    System.out.println(decryptedText);
  }

  public static List<String> getFileContent(String fileLocation) {
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(Paths.get(fileLocation));
    } catch (IOException e) {
      System.out.println("Sorry, could not read the file...");
    }
    return fileContent;
  }

  public static String getdecryptedtext(List<String> fileContent) {
    String decryptedText = "";

    for (String text : fileContent) {
      for (int i = 0; i < text.length(); i += 2) {
        decryptedText +=(text.substring(i, i + 1));
        System.out.println(decryptedText);
      }
      decryptedText += "\n";
    }
    return decryptedText;
  }
}
// Create a method that decrypts the duplicated-chars.txt