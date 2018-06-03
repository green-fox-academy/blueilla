import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
  int budget = 50;
  ArrayList<Animal> animals = new ArrayList<>();
  ArrayList<String> adopterNames = new ArrayList<>();

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }


  public void addAdopter(String adopterName) {
    adopterNames.add(adopterName);
  }

  public int earnDonation(int donation) {
    return budget += donation;
  }


}


// -  has a `budget`
// -  has an `animals` list
// -  has an `adopters` name list
// -  has a method named `rescue(animal)` this method takes an Animal object as parameter and add the animal
//    to the shelter's list and return the size of the list
//// -  has a method named `heal()` this method heals the first not healthy Animal, if it is possible by budget,
//    returns the amount of healed animals(0 or 1)
// -  has a method named `addAdopter(name)` this method takes a string as parameter and save it as a potential new owner
/// -  has a method named `findNewOwner()` this method pairs a random name with a random adoptable Animal if it is possible
//    and remove both of them from the lists
// -  has a method named `earnDonation(amount)` this method takes a whole number as parameter and increase the shelter's
//    budget by the parameter's value and returns the current budget
// -  has a method named `toString()` that represents the shelter in the following format:
// Budget: <budget>€, There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
// <animal1 name> is not healthy (<heal cost>€), and not adoptable
// <animal2 name> is healthy, and adoptable
//
// The shelter starts with 50€ without any Animal and adopter
