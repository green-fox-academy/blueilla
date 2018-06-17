package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return ("Duum-duum-duum");
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, " + this.getNumberOfStrings() + "-stringed instrument, that goes " + this.sound());
  }
}
