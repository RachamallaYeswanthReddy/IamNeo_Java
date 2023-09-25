package Day11;

public class ExceptionPropagation {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation pr= new ExceptionPropagation();
        pr.p();
        System.out.println("Normal Flow");
    }
}
