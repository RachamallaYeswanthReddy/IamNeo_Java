package Day2;

public class Foreach {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int element:numbers){
            System.out.println(element);
        }
        // string array
        String[] array = {"Ram","Marry","Aditya","Jagadesh","Jatin"};
        for(String arr : array){
            System.out.println(arr);
        }
    }
}