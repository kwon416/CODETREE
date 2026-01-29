import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                boolean always = true;
                for (int l = 0; l < k; l++) {
                    int[] narr = arr[l];

                    int a = -1;
                    int b = -1;
                    for (int m = 0; m < n; m++) {
                        if (a != -1 && b != -1) break;
                        if (narr[m] == i) a = m;
                        if (narr[m] == j) b = m;
                    }
                    if (a > b) {
                        always = false;
                        break;
                    }
                }
                if (always) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}