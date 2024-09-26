package constructor;

public class Action {

    private EDB dbName = EDB.oracle;

    public Action() {
        System.out.println("action constructor");
    }

    public Action(EDB dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        if (dbName == EDB.oracle) {
            System.out.println("Connecting to Oracle Database");
        }else if (dbName == EDB.mysql) {
            System.out.println("Connecting to MySQL Database");
        }else if (dbName == EDB.postgresql) {
            System.out.println("Connecting to PostgreSQL Database");
        }
    }

}
