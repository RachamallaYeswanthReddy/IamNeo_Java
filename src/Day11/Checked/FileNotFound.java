package Day11.Checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        try{
            FileReader fileReader=new FileReader("abc.txt");// file not found exception
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Read :"+line);
        }catch (IOException e){
            System.out.println("An error occured : "+e);
        }finally {
            try {
                if(bufferedReader!=null)
                    bufferedReader.close();
                System.out.println("try in catch");
            }catch (IOException e){
                System.out.println("Handled execption :"+e);
            }
        }
    }
}
