package Day6;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();// wrapper class
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
//        for(int i : list){
//            System.out.println(i);
//        }
//        System.out.println(list.add(5));
//        System.out.println(list.getFirst());
//        System.out.println(list.remove());// by default remove first element since fifo
//        System.out.println(list.set(1,50));
        for(int i : list){
            System.out.println(i);
        }
    }
}
