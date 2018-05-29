import java.util.ArrayList;

public class GardenApp {

  public static void main(String[] args) {

    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Tree> trees = new ArrayList<>();

    Flower yellowFlower = new Flower("yellow", 4);
    flowers.add(yellowFlower);
    Flower blueFlower = new Flower("blue", 5);
    flowers.add(blueFlower);

    Tree purpleTree = new Tree("purple", 15);
    trees.add(purpleTree);
    Tree orangeTree = new Tree("orange", 8);
    trees.add(orangeTree);
  }
}
