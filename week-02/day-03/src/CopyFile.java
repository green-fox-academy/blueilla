import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String myFile1 = "my-file.txt";
        String myFile2 = "brandnew-file.txt";
        System.out.println(fileCopyCheck(myFile1, myFile2));
    }
    public static boolean fileCopyCheck(String fileName1, String fileName2){
     boolean check = true;

     try {
         Path sourceFilePath = Paths.get(fileName1);
         Path targetFilePath = Paths.get(fileName2);
         Files.copy(sourceFilePath, targetFilePath);
     }
     catch (Exception e) {
         check = false;

     }
     return check;

    }
}
