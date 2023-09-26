package Day12.Input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine())!=null){
                System.out.println(line);
            }
            bf.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}