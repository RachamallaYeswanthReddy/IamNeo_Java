package Day12.Input;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            int character;
            while ((character = fileReader.read())!=-1){
                System.out.print((char) character);
            }
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
