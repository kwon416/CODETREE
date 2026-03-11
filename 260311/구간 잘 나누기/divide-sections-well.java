import java.util.Scanner;
public class Main {
    public static int MAX_SUM = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        // Please write your code here.
        int ans = MAX_SUM;
        for (int i = 1; i <= MAX_SUM; i++) {
            boolean possible = true;
            int section = 1;

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] > i) {
                    possible = false;
                    break;
                }

                if (cnt + nums[j] > i) {
                    cnt = 0;
                    section++;
                }
                cnt += nums[j];
            }
            
            if (possible && section <= m) {
                ans = Math.min(ans, i);
            }
        }
        System.out.print(ans);
    }
}
