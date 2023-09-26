package Day12.Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            int i=0;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
