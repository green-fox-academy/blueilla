public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 22;
        int out = 5;

        if (a % 2 == 0) {
            System.out.println(out - 1);
        } else {
            System.out.println(out);
        }

        int b = 8;
        String out2 = "";

        if (b > 10 && b < 20) {
            System.out.println(out2 = "Sweet");
        } else if (b < 10) {
            System.out.println(out2 = "Less!");
        } else if (b > 20) {
            System.out.println(out2 = "More!");
        }

        int d = 9;
        int time= 220;
        String out3 = "";

        if (d % 4 == 0 && time > 200) {
            System.out.println("Check!");
        } else if (time > 200) {
            System.out.println("Time out!");
        } else {
            System.out.println("Run Forrest Run!");
        }



    }
}
