

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;



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

        System.out.println(productList);
        Scanner scanner = new Scanner(System.in);
        int selection=-1;
        while (selection!=0){
            System.out.println("\n Выбор критерия сортировки или  0 для завершения работы");
            System.out.println("1 - по названию ");
            System.out.println("2 - по цене ");
            System.out.println("3 - по рейтингу");
            System.out.println("4 - по остатку на складе ");
            System.out.println("Ваш выбор:");
            selection = scanner.nextInt();
            if (selection==0){
                System.out.println("Выход.");
                break;
            }
            Comparator<Product> comparator = null;

            if (selection==1){
                comparator = new ComparatorProductByName();
            }else if (selection==2){
                comparator = new ComparatorProductByPrice();
            }else if (selection==3){
                comparator = new ComparatorProductByRating();
            }else if (selection==4){
                comparator = new ComparatorProductByStock();
            }
            if (comparator!=null){
                productList.sort(comparator);
                System.out.println("Список товара: ");
                for (Product produkt:productList){
                    System.out.println(produkt);
                }
            }else {
                System.out.println(" Пробуем еще раз)");
            }
        }
    }
}


       /* print(productList);
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

        */