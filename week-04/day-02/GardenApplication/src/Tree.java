public class Tree {
  /* needs water if its current water amount is less then 10
  when watering it the tree can only absorb the 40% of the water
  eg. watering with 10 the tree's amount of water should only increase with 4 */

  private int waterAmount;
  private String color;

  public Tree(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean treeNeedsWater(int waterAmount) {
    if (waterAmount < 10) {
      System.out.println("The Flower needs water!");
      return true;
    } else {
      System.out.println("The Flower does not need water.");
      return false;
    }
  }
}
