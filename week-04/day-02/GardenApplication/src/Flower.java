public class Flower {

 /* needs water if its current water amount is less then 5
  when watering it the flower can only absorb the 75% of the water
  eg. watering with 10 the flower's amount of water should only increase with 7.5 */

 private int waterAmount;
 private String color;

 public Flower(String color, int waterAmount) {
   this.color = color;
   this.waterAmount = waterAmount;
 }

  public void flowerNeedsWater() {
   if (waterAmount < 5) {
     System.out.println("The Flower needs water!");
   } else {
     System.out.println("The Flower does not need water.");
   }
  }
}
