package task2;

import java.util.Objects;

/**
 * Represents a product in the e-commerce system
 */
public class Product {
    private final String id;
    private final String name;
    private final double price;
    private final String category;
    private final double rating;
    private final boolean inStock;

    public Product(String id, String name, double price, String category,
                   double rating, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.inStock = inStock;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public double getRating() { return rating; }
    public boolean isInStock() { return inStock; }

    // Create a new Product with modified price (for transformations)
    public Product withPrice(double newPrice) {
        return new Product(id, name, newPrice, category, rating, inStock);
    }

    @Override
    public String toString() {
        return String.format("Product{id='%s', name='%s', price=%.2f, category='%s', " +
                        "rating=%.1f, inStock=%s}",
                id, name, price, category, rating, inStock);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}