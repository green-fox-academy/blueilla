import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Births {

  public static void main(String[] args) {

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

// Create a function that
// - takes a filename as a parameter,
// - reads a csv file which rows contains data in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happend.

// You can find such a csv file in this directory: births.csv
// If you pass births.csv to your function, the result should be 2006.