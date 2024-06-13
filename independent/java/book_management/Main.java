package book_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var library = new Library();

        library.addBook(new Book("Lord of The Rings"));
        library.addBook(new Book("Game of Thrones"));
        library.addBook(new Book("Piibel"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the task you want to do(add, remove, list or exit): ");
            String task = scanner.nextLine();

            if (task.equals("add")) {
                System.out.print("Enter the title of a book you want to add: ");
                String title = scanner.nextLine();
                library.addBook(new Book(title));
            }

            if (task.equals("remove")) {
                System.out.print("Enter the book title you want to remove: ");
                String removeBook = scanner.nextLine();
                library.removeBook(removeBook);
            }
            if (task.equals("list")) {
                library.printBooks();
            }
            if (task.equals("exit")) {
                break;
            }


        }
    }
}