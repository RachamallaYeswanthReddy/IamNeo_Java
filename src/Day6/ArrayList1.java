package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shivani");
        list.add("Yeswanth");
        list.add("Amulya");
        list.add("Jatin");
        list.add("Chaitanya");
        list.add("Jagadesh");
//        System.out.println(list.size());
//        for(String i:
//                list){
//            System.out.println(i);
//        }

        // lambda Expression

        // iterator
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(list.get(3));
//        System.out.println(list.indexOf("Shivani"));
        Collections.sort(list);
        for(String i:
                list){
            System.out.println(i);
        }
        // Wrapper Class
        ArrayList<Integer> nl = new ArrayList<Integer>();
    }
}
