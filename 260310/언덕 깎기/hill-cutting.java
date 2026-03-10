import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 17;
        // Please write your code here.
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= 100; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < i) {
                    cost += (arr[j] - i) * (arr[j] - i);
                }
                if (arr[j] > i + k) {
                    cost += (arr[j] - i - k) * (arr[j] - i - k);
                }
            }
            ans = Math.min(ans, cost);
         }
         System.out.println(ans);
    }
}