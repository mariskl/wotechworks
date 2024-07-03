import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static CheeseShop cheeseShop;

    public Main() {
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        cheeseShop = new CheeseShop();

        while(true) {
            System.out.println("Press 1 to add a cheese to the shop: ");
            System.out.println("Press 2 to print all cheeses: ");
            System.out.println("Press 3 to remove a cheese: ");
            System.out.println("Press 4 to add a cheese to the cart: ");
            System.out.println("Press 5 to show all the cheeses in the cart: ");
            System.out.println("Press 6 to exit: ");
            int action = scanner.nextInt();
            if (action == 1) {
                addCheese();
            } else if (action == 2) {
                printCheeses();
            } else if (action == 3) {
                removeCheese();
            } else if (action == 4) {
                addToCart();
            } else if (action == 5) {
                printCheesesInCart();
            } else if (action == 6) {
                break;
            }
        }
    }

    public static void addCheese() {
        System.out.println("Provide name of the cheese: ");
        String name = scanner.next();
        Cheese cheese = new Cheese(name);
        cheeseShop.addCheese(cheese);
    }

    public static void printCheeses() {
        for (Cheese cheese : cheeseShop.getCheeses()) {
            System.out.println(cheese.getName());
        }

    }

    public static void removeCheese() {
        System.out.println("Provide name of the cheese: ");
        String name = scanner.next();
        cheeseShop.removeCheese(name);
    }
    public static void addToCart() {
        System.out.println("Provide name of the cheese: ");
        String name = scanner.next();
        for (Cheese cheese : cheeseShop.getCheeses()) {
            if (cheese.getName().equals(name)) {
                cheeseShop.addToCart(cheese);
            }
        }
    }
    public static void printCheesesInCart(){
        for (Cheese cheese : cheeseShop.getCheesesInCart()) {
            System.out.println(cheese.getName());
        }
    }
}
