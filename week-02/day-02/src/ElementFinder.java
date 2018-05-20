import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        int item = 7;

    }
    public static List<Integer> containsSeven(ArrayList numbers) {
        
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(7)) {
                System.out.println("Hooray!!");

            } else {
                System.out.println("Nooooo!!");
            }
        } return numbers;
    }
}