package inheritance;

public class Base  {

    int number = 0;

    public Base() {
        System.out.println("Base constructor");
    }

    public Base(int number) {
        this.number = number;
    }

    public void write() {
        call();
        read("Base write");
    }

    final public void read(String data) {
        System.out.println(data);
    }

    private void call() {
        System.out.println("Base call");
    }

}
