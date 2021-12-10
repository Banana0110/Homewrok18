package task3.product;

import java.util.Arrays;

public class Milk extends Product {
    public Milk() {

    }

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    private Milk(String name, Double price, boolean beforedate) {
        super(name, price, beforedate);
    }

    private void wasted() {
        this.wasted();
        System.out.println("Ачып кетти");
    }

}
