package constructor;


public class MainConstructor {
    public static void main(String[] args) {

        Action action = new Action(EDB.mysql);
        action.connect();

    }
}
