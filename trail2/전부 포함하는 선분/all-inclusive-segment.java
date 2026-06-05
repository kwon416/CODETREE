import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            left[i] = x1;
            right[i] = x2;
        }
        // Please write your code here.
        // Arrays.sort(left);
        // Arrays.sort(right);
        int ans = Integer.MAX_VALUE;
        // if (left[1] - left[0] > right[n - 1] - right[n - 2]) {
        //     ans = right[n - 1] - left[1];
        // } else {
        //     ans = right[n - 2] - left[0];
        // }
        

        for (int i = 0; i < n; i++) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    min = Math.min(min, left[j]);
                    max = Math.max(max, right[j]);
                }
            }
            ans = Math.min(ans, max - min);
        }
        System.out.print(ans);
    }
}