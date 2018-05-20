import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        int item = 7;

    }
    public static String containsSeven(ArrayList<Integer> numbers) {
        if (numbers.contains(7)) {
            return "Hooraaayyy!!";
        } else {
            return "Nooooo!!";
        }
    }
}

