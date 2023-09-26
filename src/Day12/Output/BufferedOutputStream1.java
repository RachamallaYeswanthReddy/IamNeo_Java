package Day12.Output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            String s= "Hey....!!!!!!";
            byte[] b = s.getBytes(); // to overwrite the text
            bo.write(b);
            bo.flush();
            bo.close();
            fo.close();
            System.out.println("All Done");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}