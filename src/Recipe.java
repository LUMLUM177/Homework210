import java.util.*;

public class Recipe {

    private String name;
    private double totalCost;
    HashMap<Product, Integer> products = new HashMap<>();

    public Recipe(String name, Product product, Integer count) {
        this.name = name;
        addProduct(product, count);
        setTotalCost(calculateTotalCost());
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product, Integer count) {
        if (count == null || count < 0) {
            count = 1;
        }
        products.put(product, count);
        setTotalCost(calculateTotalCost());
    }

    public double calculateTotalCost() {
        this.totalCost = 0.0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            this.totalCost += (entry.getKey().getPrice() * entry.getValue());
        }
        return this.totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (name.equals(recipe.name)) {
            throw new RuntimeException("Нельзя добавить уже имеющийся рецепт!");
        }
        return Double.compare(recipe.totalCost, totalCost) == 0 && name.equals(recipe.name) && products.equals(recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + getName() + '\'' +
                ", products=" + getProducts() +
                ", total_cost=" + getTotalCost() +
                '}';
    }
}