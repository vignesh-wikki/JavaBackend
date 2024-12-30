// Create a program to manage a library system using OOP concepts, including classes for Book, Member, and Librarian.

package Day2.Challenges.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Librarian lb = new Librarian();

        lb.addBooks(new Book("Java", "Vignesh"));
        lb.addBooks(new Book("C++", "Vignesh"));
        lb.addBooks(new Book("C", "Vignesh"));
        lb.addBooks(new Book("Python", "Vignesh"));
        lb.addBooks(new Book("React", "Vignesh"));
        lb.addBooks(new Book("Node js", "Vignesh"));

        lb.getTotalBooks();

        lb.displayAllBooks();

        Member newMember = new Member("Vicky");

        while (true) {
            System.out.print("Enter the book name or enter 0 to exit: ");
            String bookName = sc.nextLine();
            if (bookName.equals("0"))
                break;
            Book book = lb.findBook(bookName);
            newMember.addBookToMemberList(book);
            System.out.println("Member Book list is: ");
            newMember.displayMemberBookList();
            
        }

    }
}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isBookAvailable(String title) {
        if (this.title == title && isAvailable)
            return true;
        return false;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Book title: " + title + "," + "Book author: " + author;
    }
}

class Member {
    private String name;
    private ArrayList<Book> bookList;

    public Member(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public void addBookToMemberList(Book book) {
        bookList.add(book);
    }

    public void displayMemberBookList() {
        for (Book book : bookList) {
            if (book != null) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("[null book]");
            }
        }
        System.out.println("Book list is " + bookList.size());
    }
}

class Librarian {
    private String name;
    private ArrayList<Book> books;

    public Librarian() {
        this.books = new ArrayList<>();
        this.name = "Librarain";
    }

    public void addBooks(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println(name);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getTotalBooks() {
        System.out.println("Library books are " + books.size());
    }

}
