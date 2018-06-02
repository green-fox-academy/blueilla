public class Parrots extends Animal {

  public Parrots(String name, boolean isHealthy) {
    super(name, isHealthy);
    this.healCost = (int)Math.random() * 10 + 4;
  }
}


// -  Cat's healing cost should be a random number between 0 and 6
// -  Dog's healing cost should be a random number between 1 and 8
// -  Parrot's healing cost should be a random number between 4 and 10