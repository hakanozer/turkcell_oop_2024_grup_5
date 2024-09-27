package generics;

import java.util.ArrayList;
import java.util.Random;

public class MainGeneric {
    public static void main(String[] args) {

        Action<String> action = new Action();

        action.add("İstanbul");
        action.add("İzmir");
        action.add("Adana");
        action.add("Bursa");
        action.add("Trabzon");

        action.remove(2);
        System.out.println( action.getAll() );

        Action<Random> randomAction = new Action();
        ArrayList<String> ls = new ArrayList<>();
    }
}
