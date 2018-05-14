public class PrintArguments {

    public static void main(String[] args) {
        //printParams("first");
        //printParams("first", "second");
        printParams("first", "second", "third", "fourth");


    }

    public static void printParams(String... text) {

        for (String i : text) {
            System.out.println(i);


        }

    }
}
