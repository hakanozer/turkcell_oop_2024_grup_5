package functions;

public class Functions {

    public void noParams() {
        System.out.println("No parameters");
    }

    public void params( String name, String surname ) {
        String nameSurname = name + " " + surname;
        System.out.println(nameSurname);
    }

    public boolean userLogin( String username, String password ) {
        boolean status = false;
        if (username.equals("ali01") && password.equals("12345")) {
            status = true;
        }else if (username.equals("veli01") && password.equals("12345")) {
            status = true;
        }else if (username.equals("zehra01") && password.equals("12345")) {
            status = true;
        }
        if (status) {
            System.out.println("User logged in");
        }
        return status;
    }

    public String[] cities( String[] cities ) {
        for (int i = 0; i < cities.length; i++) {
            cities[i] = "- " + cities[i];
        }
        return cities;
    }

    public void addLines( String... lines ) {
        for (String line : lines) {
            System.out.println(line);
        }
    }


}
