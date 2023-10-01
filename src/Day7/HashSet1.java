package Day7;

import Day6.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Yeswanth Reddy");
        hs.add("Shivani");
        hs.add("Pranamya");
        hs.add("Yeswanth Reddy");
        hs.add("Jatin");
        System.out.println(hs); // the o/p will be Shivani, Jatin, Yeswanth Reddy, Pranamya insteadof Yeswanth Reddy,Shivani, Jatin, Pranamya here yeswanth reddy is replaced with another so the o/p is that
        Iterator<String> itr = hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        for(String name : hs){
//            System.out.println(name);
//        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Yeswanth Reddy");
        list.add("Jatin");
        Student s = new Student(5748,"Pranamya",19);
        list.add("Yeswanth Reddy");
        list.add("Shivani");
        list.add("Amulya");
        list.add("Aditya");
        HashSet<String> newset = new HashSet<>(list);// list passed through constructor
//        for(String name : newset){
//            System.out.println(name);
//        }
//        System.out.println(newset);
        newset.remove("Aditya");
//        System.out.println(newset);
        newset.addAll(hs);
        System.out.println(newset);
    }
}
