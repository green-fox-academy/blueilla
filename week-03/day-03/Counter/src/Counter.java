public class Counter {

  private int counter;

  public Counter() {
    this.counter = 0;
  }

  public Counter(int value) {
    this.counter = value;
  }

  public int add(int number) {
    counter += number;
    return counter;
  }

  public int add() {
    counter ++;
    return counter;
  }

  public int get() {
    return counter;
  }

  public int reset() {
    return counter = 0;
  }


}
