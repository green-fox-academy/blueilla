public class NumberAdder {
    public static void main(String[] args) {
       int sum = numberAdder(20);
        System.out.println(sum);
    }

    private static int numberAdder(int limit) {
        if (limit == 1){
            return 1;
        } else {
            return limit + numberAdder(limit - 1);
        }

    }
}
