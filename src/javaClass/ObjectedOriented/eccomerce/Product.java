package javaClass.ObjectedOriented.eccomerce;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private String code;
    private String name;
    private float price;

    public Product(String name, float price) {
        this.code = UUID.randomUUID().toString();
        setName(name);
        setPrice(price);
        this.name = name;
        this.price = price;
    }

    // get method for all elements its possible to access data
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.name = name;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            throw new IllegalArgumentException("number is 0 or negative");
        }
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    // hashCode and equals only used for object code, because its our variable for
    // controlling data
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
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
        Product other = (Product) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    // acess data product and return a string
    @Override
    public String toString() {
        return "product [code=" + code + ", name=" + name + ", price=" + price + "]";
    }

}
