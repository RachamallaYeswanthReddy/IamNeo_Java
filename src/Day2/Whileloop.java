package Day2;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();
        int sum_ = 0;
        while(number>0){
            sum_+= number;
            System.out.println("Enter the number: ");
            number= sc.nextInt();
        }
        System.out.println("Sum is "+sum_);
        sc.close();
    }
}
