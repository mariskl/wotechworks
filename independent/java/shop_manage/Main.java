package shop_manage;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();

    public static void main(String[] args) {
        while (true) {

            System.out.println("Press 1 to add an item: ");
            System.out.println("Press 2 to print all items: ");
            System.out.println("Press 3 to remove an item: ");
            System.out.println("Press 4 to update an item: ");
            System.out.println("Press 5 to exit: ");

            int action = scanner.nextInt();
            if (action == 1) {
                addItem();
            } else if (action == 2) {
                printItems();
            } else if (action == 3) {
                removeItem();
            } else if (action == 4) {
                updateItem();
            } else if (action == 5) {
                break;
            }
        }
    }

    public static void addItem() {

        System.out.println("Provide an item id: ");
        int id = scanner.nextInt();
        System.out.println("Provide an item name: ");
        String name = scanner.next();
        System.out.println("Provide an item cost: ");
        int cost = scanner.nextInt();
        var item = new Item(id, name, cost);
        ItemService.addItem(item);


    }

    public static void printItems() {
        System.out.println("These are the items in storage: ");
        var items = ItemService.getItems();
        for (var item : items) {
            System.out.println(item.getId() + item.getName() + item.getCost());
        }
    }

    public static void removeItem() {
        System.out.println("Enter the ID you want to remove: ");
        int removeID = scanner.nextInt();
        itemService.removeItem(removeID);
        System.out.println(removeID + " has been removed.");
        printItems();
    }

    public static void updateItem() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter price: ");
        int cost = scanner.nextInt();
        itemService.updateItem(id, name, cost);
        System.out.println("Item updated");
    }
}
