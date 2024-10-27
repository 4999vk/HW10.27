public class Product {
    public String name;
    public int price;
    public int rating;
    public int stock;

    public Product(String name, int price, int rating, int stock){
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Product{" +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", rating=" + rating +
                ", stock=" + stock +
                '}';
    }

    public String getName(){
        return name;
    }
    public  int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public int getStock(){
        return stock;
    }
}

