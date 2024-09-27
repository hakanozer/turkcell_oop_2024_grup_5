package abstracts;

public abstract class Person {

    abstract public int accountNumber();

    public String accountName() {
        int number = accountNumber();
        String name = "";
        if(number == 100) {
            name = "Ali Bilmem";
        }else if(number == 200) {
            name = "Kemal Bilirim";
        }
        return name;
    }


    public int accountTotal() {
        int number = accountNumber();
        int total = 0;
        if(number == 100) {
            total = 1000000;
        }else if(number == 200) {
            total = 2000000;
        }
        return total;
    }

}
