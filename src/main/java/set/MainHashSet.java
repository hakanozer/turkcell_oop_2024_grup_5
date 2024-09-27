package set;

import arraylist.Product;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        Product p1 = new Product(100, "TV", "TV Detail", 20000);
        Product p2 = new Product(101, "Tablet", "Tablet Detail", 30000);
        Product p3 = new Product(102, "iPhone", "iPhone Detail", 40000);
        Product p4 = new Product(103, "Samsung", "Samsung Detail", 35000);
        Product p5 = new Product(103, "Samsung", "Samsung Detail", 35000);

        products.add(p1);
        products.add(p1);
        products.add(p2);
        products.add(p2);
        products.add(p2);
        products.add(p3);
        products.add(p3);
        products.add(p4);
        products.add(p4);
        products.add(p4);
        products.add(p5);
        products.add(p5);

        System.out.println(products);


    }
}
