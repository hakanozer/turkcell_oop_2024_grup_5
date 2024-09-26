package inheritance;

public class A extends Base {

    public A() {
        System.out.println("A constructor");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void write() {
        read("A write method");
    }

}
