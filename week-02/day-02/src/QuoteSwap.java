import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));

    }
    public static String quoteSwap(ArrayList<String> quoteList){
        quoteList.set(2, "cannot");
        quoteList.set(5, "do");
        String quote = "";
        for (int i = 0; i < quoteList.size() ; i++) {
        quoteList.set(i, quoteList.get(i) + " ");
        quote += quoteList.get(i);
        } return quote;
    }
}
