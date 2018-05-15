
import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList putSaturn(ArrayList planetList) {
        int place = planetList.indexOf("Jupiter");

        planetList.add(place + 1, "Saturn");
        return planetList;
    }
}