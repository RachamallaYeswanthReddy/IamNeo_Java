package Day12.Output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File",true);
            BufferedWriter bw  = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Yeswanth Reddy Rachamalla");
            bw.close();
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("All Done");
    }
}

