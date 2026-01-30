import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            int cnt = 0;
            boolean flag = h[0] > i;
            if (flag) cnt++;
            for (int j = 1; j < n; j++) {
                boolean now = h[j] > i;
                if (flag == false && now == true) {
                    cnt++;
                }
                flag = now;
            }
            max= Math.max(max, cnt);
        }
        System.out.print(max);
    }
}