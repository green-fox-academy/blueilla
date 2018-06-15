import java.util.Random;

abstract class Animal {

  private String name;
  private boolean isHealthy;
  private int healCost;
  Random random = new Random();

  public Animal() {
  }

  public Animal(String name, int healCost) {
    this.name = name;
    this.healCost = healCost;
  }

  public boolean heal() {
    return isHealthy = true;
  }

  public boolean isAdoptable() {
    if (isHealthy == true) {
    }
    return true;
  }

  public boolean isHealthy () {
    return isHealthy;
  }

  @Override
  public String toString() {
    if (isHealthy) {
      return this.name + " is not healthy (" + healCost + "Euro), and not adoptable.";
    } else {
      return this.name + " is healthy and adoptable";
    }
  }

    public String getName () {
      return name;
    }

    public void setName (String name){
      this.name = name;
    }

    public void setHealthy ( boolean healthy){
      isHealthy = healthy;
    }

    public int getHealCost () {
      return healCost;
    }

    public void setHealCost ( int healCost){
      this.healCost = healCost;
    }

  public Random getRandom() {
    return random;
  }

  public void setRandom(Random random) {
    this.random = random;
  }
}




// -  has a `name` and stores it's health state in a boolean
// -  has a `healCost` field
// -  has a method named `heal()`, that sets the `isHealthy` field's status to true
// -  has a method named `isAdoptable` that returns a boolean value whether it can be adopted or not (an animal
//    can be adopted if it is healthy)
// -  has a method named `toString()` that represents the Animal in the following format:
// <name> is not healthy (<heal cost>€), and not adoptable
// <name> is healthy, and adoptable
// The animal's name is the same as the class name by default, but it can be set trough constructor as well
//
// We are working with 3 types of Animals
// -  Cat's healing cost should be a random number between 0 and 6
// -  Dog's healing cost should be a random number between 1 and 8
// -  Parrot's healing cost should be a random number between 4 and 10
//