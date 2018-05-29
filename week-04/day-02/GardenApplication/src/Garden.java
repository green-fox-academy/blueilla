import java.util.List;

public class Garden {

 /* he Garden
  is able to hold unlimited amount of flowers or trees
  when watering it should only water those what needs water with equally divided amount amongst them
  eg. watering with 40 and 4 of them need water then each gets watered with 10 */

 private List flowers;
 private List trees;

 public Garden(List flowers, List trees) {
   this.flowers = flowers;
   this.trees = trees;
 }

  public List getFlowers() {
    return flowers;
  }

  public void setFlowers(List flowers) {
    this.flowers = flowers;
  }

  public List getTrees() {
    return trees;
  }

  public void setTrees(List trees) {
    this.trees = trees;
  }
}
