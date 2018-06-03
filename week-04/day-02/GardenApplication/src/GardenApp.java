import java.util.ArrayList;

/* The task is to create a garden application, so in your main method you should create
        a garden with flowers and trees. The program should demonstrate an example garden
        with two flowers (yellow and blue) and two trees (purple and orange). In the example
        after creating them you should show the user, how the garden looks like. After that
        the program should water the garden twice, first with the amount of 40 then with 70.
        And after every watering the user should see the state of the garden as you can see in the output */

public class GardenApp {

  public static void main(String[] args) {

  ArrayList <Plant> plants = new ArrayList<>();
  Garden garden = new Garden(plants);

    Flower yellowFlower = new Flower("yellow", "flower", 9);
    plants.add(yellowFlower);
    Flower blueFlower = new Flower("blue", "flower", 5);
    plants.add(blueFlower);

    Tree purpleTree = new Tree("purple", "tree", 15);
    plants.add(purpleTree);
    Tree orangeTree = new Tree("orange", "tree", 8);
    plants.add(orangeTree);


    yellowFlower.printStatus();
    blueFlower.printStatus();
    purpleTree.printStatus();
    orangeTree.printStatus();
    System.out.println(plants);
  }
}
