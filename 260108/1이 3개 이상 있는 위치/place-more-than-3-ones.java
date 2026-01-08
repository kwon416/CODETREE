import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j= 0; j < n; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (inRange(n, x, y) && arr[x][y] == 1) {
                        count++;
                    }
                }

                if (count >= 3) ans++;
            }
        }

        System.out.println(ans);
    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}