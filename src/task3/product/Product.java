package task3.product;

public class Product {
    protected String name = "DeadIniside MilkSeller";
    protected Double price = 33.50;
    private boolean beforedate;

    public Product() {
    }

    public Product(String name, Double price, boolean beforedate) {
        this.name = name;
        this.price = price;
        this.beforedate = beforedate;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Double getPrice() {
        return price;
    }

    protected void setPrice(Double price) {
        this.price = price;
    }

    protected Product(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    String[] array = new String[3];

    {
        array[0] = "Крахмал";
        array[1] = "Соль";
        array[2] = "Сахар";
    }
}
