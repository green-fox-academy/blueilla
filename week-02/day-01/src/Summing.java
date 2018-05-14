public class Summing {

    public static void main(String[] args) {

        int myNumber = 10;
        System.out.println(sum(myNumber));

    }

    public static int sum(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
           result += i;

        }
        return result;
    }

}
