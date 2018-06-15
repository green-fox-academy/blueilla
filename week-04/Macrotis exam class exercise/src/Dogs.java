public class Dogs extends Animal {

  private int healcostRandom;

  public Dogs() {
    this("Dog");
  }

  public Dogs(String name) {
    setName(name);
    setHealCost(random.nextInt(8) + 1);
  }
}


// -  Cat's healing cost should be a random number between 0 and 6
// -  Dog's healing cost should be a random number between 1 and 8
// -  Parrot's healing cost should be a random number between 4 and 10
