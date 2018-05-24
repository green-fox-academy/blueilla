public class Power {
    public static void main(String[] args) {
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    int poweredNumber = powerFunction(10, 3);
        System.out.println(poweredNumber);
        }

    private static int powerFunction(int number, int power) {
        if (power == 1) {
            return number;
        } else {
            return number * powerFunction(number, power - 1);
        }
    }
}

