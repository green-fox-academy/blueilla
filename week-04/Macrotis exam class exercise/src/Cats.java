import java.util.Random;

public class Cats extends Animal {

  public Cats(String name, boolean isHealthy) {
    super(name, isHealthy);
    this.healCost = (int)Math.random() * 6 + 0;
  }


}

// (int) Math.random() * 5 + 3
// -  Cat's healing cost should be a random number between 0 and 6
// -  Dog's healing cost should be a random number between 1 and 8
// -  Parrot's healing cost should be a random number between 4 and 10
