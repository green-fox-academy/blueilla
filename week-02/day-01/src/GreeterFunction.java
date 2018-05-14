public class GreeterFunction {

    public static void main(String[] args) {

        String al = "Greenfox";
        greet(al);


    }

    public static String greet(String somebody) {
        System.out.println("Greetings dear, " + somebody);
        return somebody;
    }
}
