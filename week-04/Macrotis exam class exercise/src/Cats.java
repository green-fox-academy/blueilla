import java.util.Random;

public class Cats extends Animal {

  private int healcostRandom;

  public Cats() {
    this("Cat");
  }

  public Cats(String name) {
    setName(name);
    setHealCost(random.nextInt(6));
  }
}

//
// -  Cat's healing cost should be a random number between 0 and 6
// -  Dog's healing cost should be a random number between 1 and 8
// -  Parrot's healing cost should be a random number between 4 and 10
