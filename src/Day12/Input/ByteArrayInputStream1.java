package Day12.Input;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream1 {
    public static void main(String[] args) {
        byte[] arr =  {23,25,68,56,78,27,73,34};
        ByteArrayInputStream barr = new ByteArrayInputStream(arr);
        int k = 0;
        while ((k=barr.read())!=-1){
            char ch = (char)k;
            System.out.println(ch);
        }

    }
}
