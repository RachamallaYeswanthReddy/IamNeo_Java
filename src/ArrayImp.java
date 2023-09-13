import java.util.Arrays;

public class ArrayImp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};

        System.out.println(arr[2]);
        System.out.println(arr.length);// length is the attribute
        for (int element : arr){ //for-each loop
            System.out.println(element);
        }
        // copying elements from one array to another
        int[] arr1 = new int[arr.length];
        //System.arraycopy(arr,0,arr1,0,arr.length);
        arr1 = Arrays.copyOfRange(arr,0,6);
        Arrays.sort(arr1);
        for (int element:arr1){
            System.out.println(element);
        }
    }
}
