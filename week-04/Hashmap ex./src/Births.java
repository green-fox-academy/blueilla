import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {

  public static void main(String[] args) {

    System.out.println(getMOstYear("./births.csv"));

  }

  public static List readFile(String fileLocation) {
    List<String> allLines = new ArrayList<>();
    try {
      Path filePath = Paths.get(fileLocation);
      allLines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return allLines;
  }

  public static List getYears(List<String> allData) {
    List<String> years = new ArrayList<>();
    for (int i = 0; i < allData.size(); i++) {
      String year = allData.get(i).split(";")[1].split("-")[0];
      years.add(year);
    }
    //System.out.println(years);
    return years;
  }

  public static Map transformData(List<String> years) {
    Map<String, Integer> countedYears = new HashMap<>();
    for (int i = 0; i < years.size(); i++) {
      String oneYear = years.get(i);
      if (countedYears.containsKey(years.get(i))) {
        countedYears.put(oneYear, countedYears.get(oneYear) + 1);
      } else {
        countedYears.put(oneYear, 1);
      }
    }
    //System.out.println(countedYears);
    return countedYears;
  }

  public static String filterMostYear(Map<String, Integer> allYears) {
    Integer temp = 0;
    String mostYears = "";
    for (String year : allYears.keySet()) {
      if (temp <= allYears.get(year)) {
        mostYears = year;
        temp = allYears.get(year);
      }
    }
    System.out.println(mostYears);
    return mostYears;
  }

  public static String getMOstYear(String fileLocation) {
    List<String> content = readFile(fileLocation);
    List<String> years = getYears(content);
    Map<String, Integer> yearsMap = transformData(years);
    return filterMostYear(yearsMap);
  }
}