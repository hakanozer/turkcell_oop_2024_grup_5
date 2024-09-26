package inheritance;

public class A extends Base {

    public A() {
        super(100);
        System.out.println("A constructor :" + number);
    }

    public int sum(int a, int b) {
        int sm = a + b;
        if (sm > 50) {
            write();
        }else {
            super.write();
        }
        return sm;
    }

    @Override
    public void write() {
        read("A write method");
    }
    

}
