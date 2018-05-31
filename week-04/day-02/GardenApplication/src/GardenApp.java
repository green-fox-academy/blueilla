import java.util.ArrayList;

/* The task is to create a garden application, so in your main method you should create
        a garden with flowers and trees. The program should demonstrate an example garden
        with two flowers (yellow and blue) and two trees (purple and orange). In the example
        after creating them you should show the user, how the garden looks like. After that
        the program should water the garden twice, first with the amount of 40 then with 70.
        And after every watering the user should see the state of the garden as you can see in the output */

public class GardenApp {

  public static void main(String[] args) {


    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Tree> trees = new ArrayList<>();
    Garden garden = new Garden(flowers, trees);

    Flower yellowFlower = new Flower("yellow", 4);
    flowers.add(yellowFlower);
    Flower blueFlower = new Flower("blue", 5);
    flowers.add(blueFlower);

    Tree purpleTree = new Tree("purple", 15);
    trees.add(purpleTree);
    Tree orangeTree = new Tree("orange", 8);
    trees.add(orangeTree);


    yellowFlower.flowerNeedsWater();
    purpleTree.treeNeedsWater();
    System.out.println(garden);
  }
}
