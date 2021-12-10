package task3.product;

public class IngredientsofProduct extends Milk {

    String name = "DeadIniside MilkSeller";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "IngredientsofProduct{" +
                "name='" + name + '\'' +
                '}';
    }
}
