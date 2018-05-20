import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));


    }
    public static boolean checkNums(ArrayList numberlist) {
        if (numberlist.contains(4) && numberlist.contains(8) && numberlist.contains(12) && numberlist.contains(16)) {
            return true;
        } else {return false;
        }
    }
}
