public class Flower extends Plant {

 /* needs water if its current water amount is less then 5
  when watering it the flower can only absorb the 75% of the water
  eg. watering with 10 the flower's amount of water should only increase with 7.5 */


  public Flower(String color, String type, int waterLevel) {
    super(color, type, waterLevel);
  }

  public Flower() {
  }

  @Override
  public void printStatus() {
    if (getWaterLevel() < 5) {
      System.out.println("The " + getColor() + " " + getType() + " needs water!");
    } else {
      System.out.println("The " + getColor() + " " + getType() + " does not need water.");
    }
  }
}
