package Day11;

public class ThrowWx {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new CustomException("Enter the age Above Zero(0)");
            }
            System.out.println("Age is :" + age);
        }catch(CustomException e){
                System.out.println(e);
            }
        }
    }

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}