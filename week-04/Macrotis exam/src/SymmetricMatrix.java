import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 0, 1)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(0, 2, 2)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(symmetricMatrix)); // should print out true
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> matrix) {
    for (int i = 0; i < matrix.size(); i++)
    {
      for (int j = 0; j < matrix.size(); j++)
      {
        if(matrix.get(i).get(j) != matrix.get(j).get(i))
        {
          return false;
        }
      }
    } return true;
  }
}
