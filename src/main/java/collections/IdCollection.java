package collections;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class IdCollection {
    public static HashSet<Integer> idCollection= new HashSet<>();

    public static int createId(){
        int id;
        while(true) {
            Date md = new Date();
            id = (int) (md.getTime()/100000);
            if(idCollection.contains(id))continue;
            break;
        }
        return id;
    }
}
