import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
        try {
            Path filePath = Paths.get("./log.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(makeIpList(lines));

        } catch (IOException e) {
            System.out.println("unidentified file path");
        }
    }
    public static String[] makeIpList(List list) {
        String[] ipList = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
          String temp = (String)list.get(i);
            ipList = temp.split("   ");

        } return ipList;

    }
}
