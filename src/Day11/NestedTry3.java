package Day11;

public class NestedTry3 {
    public static void main(String[] args) {
        //outer Try
        try{
            try {
                try {
                    int [] arr= new int[3];
                    System.out.println(arr[4]);
                }catch (ArithmeticException e){
                    System.out.println("Inner catch2");
                }
            }catch (ArithmeticException e){
                System.out.println("Inner Catch1");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inner catch 0");
            }
        }
        //outer catch
        catch(Exception e){
            System.out.println("Exception handled by outer try catch");
        }
    }
}
