public class Factorial {

    public static void main(String[] args) {
        int mynumber = 6;
        System.out.println(factorio(mynumber));



    }
    public static int factorio(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;

        }
        return result;
    }


}
