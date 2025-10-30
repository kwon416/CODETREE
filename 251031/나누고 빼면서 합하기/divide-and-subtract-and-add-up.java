import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        sum(arr, m);
    }

    static void sum(int[] arr, int m ) {
        int sum = 0;
        while (m >= 1) {

            sum += arr[m];
            if (m % 2 == 1) m--;
            else m /= 2;
            
            
        }
        System.out.println(sum);
    }
}