package task1;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bestbeforedate=" + bestbeforedate +
                '}';
    }

    private String name;
    private Double price;
    private boolean bestbeforedate;

    public Product(String name, Double price, boolean bestbeforedate) {
        this.name = name;
        this.price = price;
        this.bestbeforedate = bestbeforedate;
    }

    private String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public boolean getBestbeforedate() {
        return bestbeforedate;
    }


}
