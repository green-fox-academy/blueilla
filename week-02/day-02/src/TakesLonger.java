public class TakesLonger {
    public static void main(String... args){


        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder sb = new StringBuilder("");
        sb.append("Hofstadter's Law: It ");
        sb.append("always takes longer than you expect, even when you take into account Hofstadter's Law.");
        quote = sb.toString();

        System.out.println(quote);
    }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

