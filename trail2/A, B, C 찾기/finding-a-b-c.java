import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        // min  == A
        // max = A + B +C 
        // B + C = max - min
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = 0;
        int max = arr[arr.length - 1];

        for (int i = 2; i < arr.length; i++) {
            if (max - (a + b) == arr[i]) {
                c = arr[i];
            }
        }
        System.out.print(a + " " + b + " " + c);

    }
}