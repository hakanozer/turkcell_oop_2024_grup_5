package inheritance;

public class Base {

    public Base() {
        System.out.println("Base constructor");
    }

    public void write() {
        read("Base write");
    }

    public void read(String data) {
        System.out.println(data);
    }

}
