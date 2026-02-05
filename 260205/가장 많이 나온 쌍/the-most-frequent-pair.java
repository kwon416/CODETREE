import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int cnt = 0;

                for (int k = 0; k < m; k++) {
                    if (
                        (arr[k][0] == i && arr[k][1] == j) ||
                        (arr[k][0] == j && arr[k][1] == i)
                    ) {
                        cnt++;
                    }
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.print(max);
    }
}