package inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        call(a);
        call(b);
        call(c);

        Action action = new Action();
        int rnd = action.nextInt(0);
        System.out.println("Rnd : " + rnd);

    }

    public static void call( Base base ) {
        base.write();
    }

}
