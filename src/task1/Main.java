package task1;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar+scanner.next());

        Product product = new Product("ice-cream", 35.50, true);
        System.out.println(product.toString());
    }
}

