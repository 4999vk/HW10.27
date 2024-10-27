import java.util.Comparator;

public class ComparatorProductByPrice implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getPrice() - product2.getPrice();
    }
}