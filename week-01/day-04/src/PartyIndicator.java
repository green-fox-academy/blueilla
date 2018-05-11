public class PartyIndicator {

    public static void main(String[] args) {
        int numberOfGirls = 13;
        int numberOfBoys = 12;

        if (numberOfBoys == numberOfGirls) {
            System.out.println("Excellent!");
        } else if (numberOfBoys + numberOfGirls > 20 && numberOfBoys == numberOfGirls) {
        System.out.println("The party is excellent!");
        } else if (numberOfBoys == numberOfGirls && numberOfBoys / numberOfGirls != 1) {
            System.out.println("Average party");
        }
    }
}
