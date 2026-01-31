import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int idx = i;
            for (int j = 0; j < m; j++) {
                sum += arr[idx];
                idx = arr[idx];
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}