package shop_manage;

import java.util.ArrayList;

public class ItemService {
    private static ArrayList<Item> items = new ArrayList<>();

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        for (var item : items) {
            if (item.getId() == id) {
                items.remove(item);
                return;
            }
        }
    }

    public void updateItem(int id, String name, int cost) {
        for (var item : items) {
            if (item.getId() == id) {
                item.setName(name);
                item.setCost(cost);
                return;
            }
        }
    }
}
