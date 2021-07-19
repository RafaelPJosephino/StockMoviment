
package Application;

import Entities.Products;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Products products = new Products();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product data");
        System.out.print("Name:");
        products.name = s.next();
        System.out.print("Price: ");
        products.price = s.nextDouble();
        System.out.print("Quantity in stock: ");
        products.stock = s.nextInt();

        System.out.println(products);
        System.out.print("Enter the number of products to be add in stock: ");
        products.addStock(s.nextInt());
        System.out.println(products);
        System.out.print("Enter the number of products to be Remove in stock: ");
        products.removeStock(s.nextInt());
        System.out.println(products);
        s.close();

    }

}
