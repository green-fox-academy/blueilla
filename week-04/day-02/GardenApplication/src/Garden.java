import java.util.ArrayList;

public class Garden {

 /* the Garden is able to hold unlimited amount of flowers or trees
  when watering it should only water those what needs water with equally divided amount amongst them
  eg. watering with 40 and 4 of them need water then each gets watered with 10 */

 private ArrayList<Plant> plants;
 private int waterAmount;


  public Garden(ArrayList<Plant> plants, int waterAmount) {

    this.plants = plants;
    this.waterAmount = waterAmount;
  }

  public Garden(ArrayList<Plant> plants) {
    this.plants = plants;
  }

  public ArrayList<Plant> getPlants() {
    return plants;
  }

  public void setPlants(ArrayList<Plant> plants) {
    this.plants = plants;
  }
  public int getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  /* public void watering(int waterAmount, ArrayList<Plant> plants) {
    System.out.println("Watering with" + waterAmount);
    for (Plant plant : plants) {

    }

  } */
}

