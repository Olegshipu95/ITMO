package collections;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class IdCollection {
    public static HashSet<Integer> idCollection= new HashSet<>();

    public static int createId(){
        int id;
        while(true) {
            id = (int) (Math.random() * 1000 + 1000);
            if(idCollection.contains(id))continue;
            break;
        }
        return id;
    }
}
