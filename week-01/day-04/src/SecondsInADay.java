public class SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 43;
        int currentSeconds = 42;


        int sumMinutes = currentHours * 60;
        int sumSeconds = sumMinutes * 60 * 60 + 42;
        int sumSumSeconds = 24 * 60 * 60 * 60;

        System.out.println(sumSumSeconds - sumSeconds);

        // nem jo, ujra kell gondolni //
    }
}
