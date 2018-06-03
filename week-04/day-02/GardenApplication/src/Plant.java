public class Plant {

  private String color;
  private String type;
  private int waterLevel;


  public Plant(String color, String type, int waterLevel) {
    this.color = color;
    this.type = type;
    this.waterLevel = waterLevel;
  }

  public Plant() {
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(int waterLevel) {
    this.waterLevel = waterLevel;
  }


  public void printStatus() {
    if (getWaterLevel() < 10) {
      System.out.println("The " + getColor() + " " + getType() + " needs water!");
    } else {
      System.out.println("The " + getColor() + " " + getType() + " does not need water.");
    }
  }
}

