package Day12.Input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i=0;
            while((i=bufferedInputStream.read())!=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();
            bufferedInputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
