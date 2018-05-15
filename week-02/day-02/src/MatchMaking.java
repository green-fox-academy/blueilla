import java.util.*;

public class MatchMaking{

    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane","Anna","Elsa"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches (ArrayList girls, ArrayList boys) {
        ArrayList<String> merged = new ArrayList<>();
        int shorterList = 0;
        if (girls.size() < boys.size()) {
            shorterList = girls.size();
        } else {
            shorterList = boys.size();
        }
        for (int i = 0; i < shorterList; i++) {
            merged.add((String)girls.get(i));
            merged.add((String)boys.get(i));
            //System.out.println(merged);
        }
        return merged;

    }
}