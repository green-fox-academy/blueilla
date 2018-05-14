public class Summing {

    public static void main(String[] args) {

        int myNumber = 10;
        System.out.println(sum(myNumber));

    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
           sum += i;

        }
        return sum;
    }

}
