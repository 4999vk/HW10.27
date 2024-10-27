import java.util.Comparator;

public class ComparatorProductByRating implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getRating() - product2.getRating();
    }
}