package shop_manage;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> cart = new ArrayList<>();

    public void addItemToCart(Item item) {
        cart.add(item);
    }

    public int checkout() {
        int sum = 0;
        for (var item : cart) {
            sum += item.getCost();
        }
        return sum;
    }
}
