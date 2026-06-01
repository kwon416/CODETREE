import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int diff = arr[i + n] - arr[i];
            ans = Math.min(ans, diff);
        }

        System.out.println(ans);
    }
}