package properties;

public class MainProperties {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setId(100);
        u1.setName("Ayşe");
        u1.setSurname("Bilirim");
        u1.setEmail("ayse@mail.com");
        u1.setPassword("123456");

        User u2 = new User();
        u2.setId(200);
        u2.setName("Kemal");
        u2.setSurname("Bil");
        u2.setEmail("kemal@mail.com");
        u2.setPassword("123456");

        User u3 = new User(300, "Veli", "Bil", "veli@mail.com", "12345");

        User[] users = {u1, u2, u3};

        for (User item : users) {
            System.out.println( item );
        }

    }
}
