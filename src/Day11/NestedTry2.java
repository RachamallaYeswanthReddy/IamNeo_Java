package Day11;

public class NestedTry2 {
    public static void main(String[] args) {
        //outer try
        try
        {
            //inner try1
            try {
                int[] a = new int[5];
                a[5] = 4;
            }
            //inner catch1
            catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println("Try Block 1");
            //inner try2
            try {
                int b = 40 / 0;
            }
            //inner catch2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other statements in the outer try block");
        }
        //outer catch
        catch(Exception e){
            System.out.println("Handled execption in outer catch block");
        }
        System.out.println("Normal flow");
    }
}