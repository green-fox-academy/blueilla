public class BunniesAgain {
    public static void main(String[] args) {


        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
        int bunnyEars = earCounterFunction(26);
        System.out.println(bunnyEars);

    }

    private static int earCounterFunction(int bunnies) {
        int bunnyEars = 2;
        if (bunnies == 1) {
            return bunnyEars;
        } else {
            if (bunnies % 2 == 0) {
                return bunnyEars + 1 + earCounterFunction(bunnies - 1);
            } else {
                return bunnyEars + earCounterFunction(bunnies - 1);
            }
        }
    }
}