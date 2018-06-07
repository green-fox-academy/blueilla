import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Births {

  public static void main(String[] args) {

    String filePath = "./births.csv";
   // System.out.println(readFileContent(filePath));
    System.out.println(getBirthDates(readFileContent(filePath)));

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
  public static List<Integer> getBirthDates(List<String> fileContent) {
    List<Integer> birthdates = new ArrayList<>();
    for (int i = 0; i < fileContent.size(); i++) {
      birthdates.add(Integer.parseInt(fileContent.get(i).split(";"));
    }
    return birthdates;
  }
}
