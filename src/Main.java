

import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>( List.of(


                new Product("Milk",2,2,5),
                new Product("Milk",3.3,5,2),
                new Product("Yogurt",5,4,3),
                new Product("Cheese",2,1,1),
                new Product("Ponchik",1,3,4),
                new Product("Cheese",6,4.5,5)
        ));

        print(productList);
        productList.sort(new ComparatorProductByName());
        System.out.println("------------ sort By Name --------------- ");
        print(productList);

        productList.sort(new ComparatorProductByPrice());
        System.out.println("------------ sort By Price --------------- ");
        print(productList);

        productList.sort(new ComparatorProductByRating());
        System.out.println("------------ sort By Rating --------------- ");
        print(productList);

        productList.sort(new ComparatorProductByStock());
        System.out.println("------------ sort By Stock --------------- ");
        print(productList);





    }
    public static void print(List<Product> list){
        for (Product product:list){
            System.out.println(product);
        }
    }
}