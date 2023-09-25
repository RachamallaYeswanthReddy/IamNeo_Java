package Day11.Checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundThrows {
    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
        BufferedReader bufferedReader =new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        System.out.println("Read : "+line);
    }
    static void n() throws IOException{
        readFile();
    }
    public static void main(String[] args) throws IOException {
        try {
            n();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
