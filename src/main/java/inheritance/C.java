package inheritance;

public class C extends Base{

    public C() {
        System.out.println("C constructor");
    }

    @Override
    public void write() {
        read("C write method");
    }

}
