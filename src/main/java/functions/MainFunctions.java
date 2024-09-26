package functions;

public class MainFunctions {

    public static void main(String[] args) {

        Functions functions = new Functions();
        functions.noParams();

        functions.params("Ali", "Bilmem");
        functions.params("Zehra", "Bilsin");

        boolean loginStatus = functions.userLogin("ali0", "12345");
        System.out.println( loginStatus );

        String[] cities = {"İstanbul", "İzmir", "Bursa", "Adana"};
        cities = functions.cities(cities);
        for (String city : cities) {
            System.out.println(city);
        }

        functions.addLines("Address line - 1", "Address line - 2", "Address line - 3");

    }

}
