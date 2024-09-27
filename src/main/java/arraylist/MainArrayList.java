package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {

        String[] arr = {"Kaan", "Asya", "Zehra", "Ali", "Erkan"};
        ArrayList<String> ls = new ArrayList<>();

        // add item
        ls.add("İstanbul");
        ls.add("Ankara");
        ls.add("İzmir");
        ls.add("Adana");
        ls.add("Trabzon");
        ls.add("Zonguldak");

        /*
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("City?");
            String city = scanner.nextLine();
            ls.add(city);

            System.out.println("Exit?");
            String exit = scanner.nextLine();
            if(exit.equalsIgnoreCase("exit")) {
                break;
            }
        }
         */

        // get item
        int index = -1;
        int size = ls.size();
        if ( size > index && index > -1 ) {
            System.out.println( ls.get(index) );
        }

        System.out.println("=================");
        // get items
        for ( int i = 2; i < size; i++ ) {
            System.out.println( ls.get(i) );
        }

        System.out.println("=================");
        for (String item : ls) {
            System.out.println(item);
        }

        // remove item
        // ls.remove(1);
        // ls.remove("Ankara");
        // ls.clear();
        // ls.removeIf(item -> item.contains("a"));

        int indexOf = ls.indexOf("Adana");
        System.out.println(indexOf);

        boolean contains = ls.contains("Adana");
        System.out.println(contains);


        System.out.println(ls);
        System.out.println(arr);

        System.out.println("=================");
        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product(100, "TV", "TV Detail", 20000);
        Product p2 = new Product(101, "Tablet", "Tablet Detail", 30000);
        Product p3 = new Product(102, "iPhone", "iPhone Detail", 40000);

        products.add(p1);
        products.add(p1);
        products.add(p2);
        products.add(p2);
        products.add(p2);
        products.add(p3);
        products.add(p3);

        System.out.println(products);

    }
}
