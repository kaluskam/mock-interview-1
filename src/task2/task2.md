# Scenario
You're building an e-commerce system that needs flexible product filtering capabilities. Implement a solution using lambda expressions and functional interfaces.

You're provided with `Product` class with the following properties:

id (String)
name (String)
price (double)
category (String)
rating (double)
inStock (boolean)

**Requirements**

## Part 1: Custom Functional Interfaces
Create the following functional interfaces:

`ProductFilter` - filters products based on criteria
`PriceTransformer` - applies price transformations (discounts, taxes, etc.)
`ProductComparator` - custom comparison logic

## Part 2: ProductService
Create a `ProductService` class with methods that:

Filter products using various criteria:

By price range
By category
By rating (minimum)
By stock availability
Bonus: Combine multiple filters using AND/OR logic

Transform prices for:

Applying percentage discount
Adding tax
Converting currency (multiply by rate)

Sort products using different strategies:

By price (ascending/descending)
By rating
By name



Part 4: Advanced Usage
Implement a method that chains operations:
```
        List<Product> getDiscountedProductsAboveRating(
            List<Product> products,
            double minRating,
            double discountPercent
        );
```

Example Usage:
```
        ProductService service = new ProductService();

// Filter
        List<Product> expensive = service.filterProducts(products,
        p -> p.getPrice() > 100);

// Transform
        List<Product> discounted = service.applyPriceTransformation(products,
        price -> price * 0.9); // 10% discount

// Sort
        List<Product> sorted = service.sortProducts(products,
        (p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
```