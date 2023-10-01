package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Yeswanth");
        treeSet.add("Shivani");
        treeSet.add("Jatin");
        treeSet.add("Amulya");
        treeSet.add("Pranamya");
        treeSet.add("Shivani");
        Iterator itr= treeSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Descending order");
        System.out.println("===================");
        Iterator ditr= treeSet.descendingIterator();
        while (ditr.hasNext()){
            System.out.println(ditr.next());
        }
//        for(String name : treeSet){
//            System.out.println(name);
//        }
        System.out.println("Lowest :" + treeSet.pollFirst());
        System.out.println("Highest :" + treeSet.pollLast());

        //Navigable Set
        TreeSet<String> s = new TreeSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("F");
        s.add("G");
        s.add("H");
        s.add("I");
        System.out.println(s.headSet("F"));
        System.out.println(s.headSet("F",true));
        System.out.println(s.tailSet("F")); // by default its true
        System.out.println(s.tailSet("F",false));
// Imp: Implementation difference between hashset and treeset
// Hashset uses hashtable
// Tree set uses pre datastructures
// both won't allow duplicates
    }

}
