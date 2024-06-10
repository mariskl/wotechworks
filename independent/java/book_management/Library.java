package book_management;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void printBooks() {
        for (Book value : books) {
            System.out.println(value.getTitle());
        }
    }
}
