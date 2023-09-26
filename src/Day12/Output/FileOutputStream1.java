package Day12.Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            fo.write(68);
            fo.close();
            System.out.println("All Done");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
