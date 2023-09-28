package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            if (n > 0) {
                System.out.println(arr[0]);
            } else {
                System.out.println("Array is empty");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
