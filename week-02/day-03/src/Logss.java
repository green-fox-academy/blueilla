import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logss {

  public static void main(String[] args) {
    String fileLocation = "log.txt";
    System.out.println(printUniqueIps(fileLocation));

  }
  public static List<String>printUniqueIps(String fileLocation) {
    List<String> fileContent = getFilecontent(fileLocation);
    ArrayList<String> splittedLines = getSplittedLines(fileContent);
    ArrayList<String> uniqueIps = getUniqueIps(splittedLines);
    return uniqueIps;
  }

  private static ArrayList<String> getUniqueIps(ArrayList<String> splittedLines) {
    ArrayList<String>uniqueIps = new ArrayList<>();
    for (int i = 0; i < splittedLines.size(); i++) {
      if(splittedLines.get(i) != splittedLines.get(i) + 1);
      uniqueIps.add(splittedLines.get(i));
    }
    return uniqueIps;
  }

  private static ArrayList<String> getSplittedLines(List<String> fileContent) {
    ArrayList<String>splittedLines = new ArrayList<>();
    for (int i = 0; i < fileContent.size(); i++) {
      String splitted = fileContent.get(i).split("   ")[1];
      splittedLines.add(splitted);
    }
    return splittedLines;
  }

  private static List<String> getFilecontent(String filePath) {
    List<String> allLines = new ArrayList<>();
    try {
      allLines = Files.readAllLines(Paths.get(filePath));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return allLines;
  }
}
