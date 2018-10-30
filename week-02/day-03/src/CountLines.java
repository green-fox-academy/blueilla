
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

      String myFile = "my-file.txt";
      System.out.println(LineCount(myFile));
    }

    public static int LineCount(String fileName) {
       int lineNum = 0;

        try {
           Path filePath = Paths.get(fileName);
           List<String> lines = Files.readAllLines(filePath);
           lineNum = lines.size();
           } catch (Exception e) {
          return 0;
        }
        return lineNum;
    }
}
