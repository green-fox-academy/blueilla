import java.util.Arrays;

public class Anagram {

  //Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
  //Create a test for that.

  public static boolean isAnagram(String word1, String word2) {
    if (word1.length() != word2.length()){
      return false;
    }
    char tempArray[] = word1.toCharArray();
    Arrays.sort(tempArray);

    char tempArray2[] = word2.toCharArray();
    Arrays.sort(tempArray2);

    String word11 = "";
    String word22 = "";
    for (int i = 0; i < tempArray.length; i++) {
      word11 += tempArray[i];
      word22 += tempArray2[i];
    }

    for (int i = 0; i < word1.length(); i++) {
      if (word11.charAt(i) != word22.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}

