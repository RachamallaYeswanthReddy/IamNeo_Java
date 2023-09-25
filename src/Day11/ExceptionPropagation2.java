package Day11;

import java.io.IOException;

public class ExceptionPropagation2 {
    void m() throws IOException{
        throw new IOException("Device Error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception is handled in p");
        }
    }
    public static void main(String[] args) {
        ExceptionPropagation propagation2=new ExceptionPropagation();
        propagation2.p();
        System.out.println("Rest code");
    }
}