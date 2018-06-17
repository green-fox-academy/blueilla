import java.util.ArrayList;

public class SharpieSet {

  ArrayList<Sharpie> sharpieSet = new ArrayList<Sharpie>();

  public int countUsable(ArrayList<Sharpie> sharpieList) {
    int usableSharpies = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount > 0) {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  public ArrayList<Sharpie> removeTrash(ArrayList<Sharpie> sharpieList) {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount <= 0) {
        sharpieList.remove(sharpieList.get(i));
      }
    }
    return sharpieList;
  }
}


 /* Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
                countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies */
