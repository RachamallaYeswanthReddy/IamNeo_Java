package Day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Yeswanth");
        hm.put(2,"Shivani");
        hm.put(3,"Pranamya");
        hm.put(4,"Mounica");
        hm.put(5,"Amulya");
        hm.put(1,"Rachamalla");
        System.out.println(hm);
        for (Map.Entry v: hm.entrySet()){
            System.out.println(v.getKey()+"  "+v.getValue());
        }
        Iterator itr = hm.keySet().iterator();
        while (itr.hasNext()){
            int key =(int)itr.next();
            System.out.println(key + " "+hm.get(key));
        }
    }
}
