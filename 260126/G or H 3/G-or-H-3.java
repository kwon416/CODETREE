import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[10000];

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt() - 1;
            char c = sc.next().charAt(0);
            arr[pos] = c == 'G' ? 1 : 2;
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k; j++) {
                sum += arr[j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.print(ans);
    }
}