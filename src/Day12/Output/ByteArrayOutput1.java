package Day12.Output;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutput1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream bo = new FileOutputStream("C:\\SAI\\JAVA\\IamNeo_\\src\\Day12\\File");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(67);
        bout.writeTo(bo);

        bout.flush();
        bout.close();
    }
}
