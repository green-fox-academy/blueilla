import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        String myFileName = "draw.txt";


        if (myFileName =="win-o.txt"){
            System.out.println("O");
        }else if (myFileName =="win-x.txt"){
            System.out.println("X");
        }else if (myFileName =="draw.txt"){
            System.out.println("Draw");
        }
    }
    public static String ticTacResult(String fileName){
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
        }catch (Exception e) {
        } return fileName;
    }
}
