// Create a
// class Book with default values for
// title and
// author.Write a default
// constructor to
// initialize these attributes.

package Day2.Constructors.DefaultConstructor;

public class Book {
    public String title;
    public String author;

    public Book() {
        title = "Don't judge book by its cover";
        author = "Someone";
        System.out.println(title);
        System.out.println(author);
    }

    public static void main(String[] args) {
        Book bk = new Book();
    }
}
