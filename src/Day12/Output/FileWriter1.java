package Day12.Output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File",true);
            fw.write("Yeswanth Reddy \n Rachamalla");
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("All Done");
    }
}
