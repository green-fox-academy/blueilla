public class PostItMain {

    public static void main(String[] args) {

        PostIt postIt = new PostIt();
        postIt.backgroundColor = "Orange";
        postIt.text = "Idea 1";
        postIt.textcolor = "blue";

        PostIt postIt1 = new PostIt();
        postIt1.backgroundColor = "pink";
        postIt1.text = "Awesome";
        postIt1.textcolor = "black";

        PostIt postIt2 = new PostIt();
        postIt2.backgroundColor = "yellow";
        postIt2.text = "Superb!";
        postIt2.textcolor = "green";


        System.out.println(postIt.text);
    }
}
