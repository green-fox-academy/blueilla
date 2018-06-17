package main.java.zoo;

public class Bird extends Animal {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void toFeed() {

  }
}
