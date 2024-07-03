import java.util.ArrayList;

public class CheeseShop {

        private ArrayList<Cheese> cheeses = new ArrayList();
        private ArrayList<Cheese> cart = new ArrayList();

        public CheeseShop() {
        }

        public ArrayList<Cheese> getCheeses() {
            return this.cheeses;
        }

        public void addCheese(Cheese cheese) {
            this.cheeses.add(cheese);
        }

        public void removeCheese(String name) {
            for (Cheese cheese : this.cheeses) {
                if (cheese.getName().equals(name)) {
                    cheeses.remove(cheese);
                    return;
                }
            }
        }
        public void addToCart(Cheese cheese) {
            for (Cheese cart : this.cart) {
                if (cart.getName().equals(cheese.getName())) {
                    cheeses.add(cart);
                }
            }
        }
        public ArrayList<Cheese> getCheesesInCart(){
            return this.cart;
        }

}

