public class Bunnies {
    public static void main(String[] args) {
        int bunnyEars = bunnyEarCounter(123);
        System.out.println(bunnyEars);
    }

    private static int bunnyEarCounter(int bunnies) {
        int ears = 2;
        if (bunnies == 1) {
            return ears;
        } else {
            return ears + bunnyEarCounter(bunnies - 1);
        }
    }
}
