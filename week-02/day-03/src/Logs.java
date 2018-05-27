import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("./log.txt");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (IOException e) {
            System.out.println("unidentified file path");
        }
    }
}
