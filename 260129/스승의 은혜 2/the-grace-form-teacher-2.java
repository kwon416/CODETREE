import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        // Please write your code here.d
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 배열 복사
            int[] np = new int[n];
            for (int j = 0; j < n; j++) {
                np[j] = p[j];
            }
            np[i] = (int) np[i] / 2;
            Arrays.sort(np);
            int nb = b;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                nb -= np[j];
                if (nb <= 0) {
                    break;
                }
                cnt++;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}