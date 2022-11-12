import Product.Product;
import Recipe.Good;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <ShoppingList> void main(String[] args) {
       }
        public class ShoppingList {

        ShoppingList shoppingList = new ShoppingList();
        Set<Product> set;

            public ShoppingList() {

            }

            {
            set = new HashSet<>();
        }

        public void add(Good good, double weight, double price) {
            final Product product = new Product(good, weight, price);
            if (set.contains(product)) {
                throw new IllegalArgumentException("Продукт есть в списке!");
            }
            set.add(product);
        }

        public void markAsPurchased (Good good){
            set.stream().filter(p -> p.getGood() == good).findAny().ifPresent(p -> p.setPurchased(true));
        }

        public void remove (Good good){
            final Product target;
            target = set.stream().filter(p -> p.getGood() == good).findAny().orElse(null);
            set.remove(target);
        }

        public void show () {
            set.forEach(p -> {
                System.out.printf("%s, %.2f кг, %.2f рублей, купленный - %b\n",
                        p.getGood().getName(),
                        p.getWeight(),
                        p.getPrice(),
                        p.isPurchased());
            });
        }
    }

    private static void ShoppingList() {
    }
}