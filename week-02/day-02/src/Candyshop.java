import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }
    public static List<String> sweets(ArrayList items) {
      items.set(1, "Croissant");
      items.set(3, "Ice cream");
      return items;
    }
}