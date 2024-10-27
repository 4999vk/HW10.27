public class Product {
    public String name;
    public double price;
    public double rating;
    public int stock;

    public Product(String name, double price, double rating, int stock){
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
    public  double getPrice(){
        return price;
    }
    public double getRating(){
        return rating;
    }
    public int getStock(){
        return stock;
    }
}

