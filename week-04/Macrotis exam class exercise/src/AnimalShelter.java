import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {

  private int budget = 50;
  private ArrayList<Animal> animals = new ArrayList<>();
  private ArrayList<String> adopterNames = new ArrayList<>();
  Random random = new Random();

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }

  public int heal() {
    for (int i = 0; i < animals.size(); i++) {
      if(!animals.get(i).isHealthy() && budget > animals.get(i).getHealCost()) {
        animals.get(i).setHealthy(true);
        budget -= animals.get(i).getHealCost();
        return 1;
      }
    }
    return 0;
  }

  public void addAdopter(String name) {
    adopterNames.add(name);
  }

  public void findNewOwner() {
    if (!animals.isEmpty() && !adopterNames.isEmpty()) {
      int num = random.nextInt(adopterNames.size());
      while (!animals.get(num).isAdoptable()) {
        num = random.nextInt(adopterNames.size());
      }
      animals.remove(num);
      adopterNames.remove(random.nextInt(adopterNames.size()));
    }
  }

  public int earnDonation(int donation) {
    return budget += donation;
  }

  @Override
  public String toString() {
    String status =  "Budget: " + budget + ", There are " + animals.size() + " animals and " + adopterNames.size() + " potential adopters";
    for (Animal currentAnimal : animals) {
      status = status + "\n" + currentAnimal.toString();
    }
    return status + "\n";
  }
}



// -  has a `budget`
// -  has an `animals` list
// -  has an `adopters` name list
// -  has a method named `rescue(animal)` this method takes an Animal object as parameter and add the animal
//    to the shelter's list and return the size of the list
//// -  has a method named `heal()` this method heals the first not healthy Animal, if it is possible by budget,
//    returns the amount of healed animals(0 or 1)
// -  HAS A METHOD named `addAdopter(name)` this method takes a string as parameter and save it as a potential new owner
/// -  HAS A METHOD named `findNewOwner()` this method pairs a random name with a random adoptable Animal if it is possible
//    and remove both of them from the lists
// -  has a method named `earnDonation(amount)` this method takes a whole number as parameter and increase the shelter's
//    budget by the parameter's value and returns the current budget
// -  has a method named `toString()` that represents the shelter in the following format:
// Budget: <budget>€, There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
// <animal1 name> is not healthy (<heal cost>€), and not adoptable
// <animal2 name> is healthy, and adoptable
//
// The shelter starts with 50€ without any Animal and adopter
