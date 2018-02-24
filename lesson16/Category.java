package lesson16;

import java.util.Set;

public class Category {
    private String name;
    private Set<Product> genProduct;

    public Category(String name, Set<Product> genProduct) {
        this.name = name;
        this.genProduct = genProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getGenProduct() {
        return genProduct;
    }

    public void setGenProduct(Set<Product> genProduct) {
        this.genProduct = genProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return genProduct != null ? genProduct.equals(category.genProduct) : category.genProduct == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (genProduct != null ? genProduct.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", genProduct=" + genProduct +
                '}';
    }
}
