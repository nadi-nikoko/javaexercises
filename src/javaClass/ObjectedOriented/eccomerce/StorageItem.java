package javaClass.ObjectedOriented.eccomerce;

import java.util.Objects;

public class StorageItem {

    public static enum State {
        IN_STOCK, OUT_OF_STOCK, DISCONTINUED
    }

    private Product product;
    private int quantity;
    private State state;

    public StorageItem(Product product, int quantity) {
        // send a message in case product value is null
        Objects.requireNonNull(product, "product is empty");
        this.product = product;
        // because quantity is possible to be change in this class, there is a method
        // for check if the value is positive or zero
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StorageItem other = (StorageItem) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }

    public State getState() {
        return state;
    }

    public void setQuantity(int quantity) {
        // check if the quantity is zero before assign
        if (quantity < 0) {
            throw new IllegalArgumentException("negative quantity is not allowed");
        }
        this.quantity = quantity;
        this.state = this.quantity > 0 ? State.IN_STOCK : State.OUT_OF_STOCK;
    }

    public void discontinue() {
        this.state = State.DISCONTINUED;
    }

    @Override
    public String toString() {
        return "StorageItem [product=" + product + ", quantity=" + quantity + ", state=" + state + "]";
    }

}
