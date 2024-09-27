package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<String, Object> hm = new HashMap<>();

        // add item
        hm.put("name", "Erkan");
        hm.put("name", "Serkan");
        hm.put("surname", "Bilmem");
        hm.put("email", "serkan@mail.com");
        hm.put("age", 38);
        hm.put("status", true);

        // get item
        System.out.println( hm.get("name") );

        // get keys
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println( key + " : " + hm.get(key) );
        }

        // remove item
        // hm.remove("email");
        // hm.clear();

        // set
        hm.replace("name", "Serkan", "Kemal");

        // values
        Collection<Object> values = hm.values();
        for (Object value : values) {
            System.out.println( value );
        }

        System.out.println( hm.size() );
        System.out.println(hm);

    }
}
