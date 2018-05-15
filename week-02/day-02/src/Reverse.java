public class Reverse {

    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        String normal = "";
        for (int i = 0; i < reversed.length(); i++) {
            normal += reversed.charAt(reversed.length() -1 - i);

        }
        System.out.println(normal);

       // System.out.println(reverse(reversed));
    }


}
