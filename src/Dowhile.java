import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();
        int sum_ = 0;
        do{
            sum_+= number;
            System.out.println("Enter the number: ");
            number= sc.nextInt();
        }while (number>0);
        System.out.println(sum_);
        sc.close();
    }
}
