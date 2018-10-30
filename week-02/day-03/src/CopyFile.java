
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    String myFile1 = "my-file.txt";
    String myFile2 = "target.txt";
    System.out.println(fileCopyCheck(myFile1, myFile2));
  }
  public static boolean fileCopyCheck(String fileName1, String fileName2){


    try {
      Path sourceFilePath = Paths.get(fileName1);
      Path targetFilePath = Paths.get(fileName2);
      Files.copy(sourceFilePath, targetFilePath);
    }
    catch (Exception e) {
      return false;

    }
    return true;
  }
}