import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));


    }
    public static boolean checkNums(ArrayList numberList) {
        if (numberList.contains(4) && numberList.contains(8) && numberList.contains(12) && numberList.contains(16)) {
            return true;
        } else {return false;
        }
    }
}
