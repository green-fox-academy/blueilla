import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogExercise {

  public static void main(String[] args) {
    String filePath = "log.txt";
    List<String> allLines = readFile(filePath);
    System.out.println(getUniqueIPaddresses(allLines));


  }

  private static ArrayList<String> getUniqueIPaddresses(List<String> allLines) {
    ArrayList<String> ipAddresses = new ArrayList<>();

    for (int i = 0; i < allLines.size(); i++) {
      String ipAddress = allLines.get(i).split("   ")[1];
      ipAddresses.add(ipAddress);
    }

    ArrayList<String> uniqueIPs = new ArrayList<>();
    for (int i = 0; i < ipAddresses.size() - 1; i++) {
      if (ipAddresses.get(i) != ipAddresses.get(i + 1)) {
        uniqueIPs.add(ipAddresses.get(i));
      }
    }
    return uniqueIPs;
  }


  public static List<String> readFile(String fileLocation) {
    List<String> allLines = new ArrayList<>();
    try {
      allLines = Files.readAllLines(Paths.get(fileLocation));
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return allLines;
  }

}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
