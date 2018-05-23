public class Animal {
    static int hunger = 50;
    static int thirst = 50;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int eat(int hunger) {
        return Animal.hunger -= 1;
    }

    public int drink(int thirst) {
        return Animal.thirst -= 1;
    }
    public int play(int hunger, int thirst) {
        Animal.hunger += 1;
        Animal.thirst += 1;
        return play(hunger, thirst);
    }

}
