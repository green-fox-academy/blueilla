public class BlogPostMain {

    public static void main(String[] args) {

        BlogPost blogPost = new BlogPost();
        blogPost.authorName = "John Doe";
        blogPost.title = "Lorem ipsum";
        blogPost.publicationDate = "2000. 05. 04.";
        blogPost.text = "Lorem ipsum dolor sit amet.\n";

        BlogPost blogPost1 = new BlogPost();
        blogPost1.authorName = "Tim Urban";
        blogPost1.title = "Wait but why";
        blogPost1.publicationDate = "2010. 10. 10.";
        blogPost1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost blogPost2 = new BlogPost();
        blogPost2.authorName = "Daniel  Hanley";
        blogPost2.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost2.publicationDate = "2017. 03. 28.";
        blogPost2.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        System.out.println(blogPost2.text);

    }
}
