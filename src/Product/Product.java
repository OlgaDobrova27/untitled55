package Product;

import Recipe.Good;

public class Product {

    private final Good good;
    private double weight;
    private double price;
    private boolean isPurchased;

    public Product(Good good, double weight, double price) {
        this.good = good;
        setWeight(weight);
        setPrice(price);
        isPurchased = false;
    }

    public Good getGood() {
        return good;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setWeight(double weight) {
        this.weight = Math.max(weight, 0);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return good == product.good;
    }

    @Override
    public int hashCode() {
        return good != null ? good.hashCode() : 0;
    }
}
