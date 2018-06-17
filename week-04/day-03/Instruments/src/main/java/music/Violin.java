package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    super(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return ("Screech");
  }

  @Override
  public void play() {
    System.out.println("Violin, " + this.getNumberOfStrings() + "-stringed instrument, that goes " + this.sound());
  }
}
