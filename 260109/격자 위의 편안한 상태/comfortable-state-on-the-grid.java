import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[n][n];
        
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;

            points[row][col] = 1;
            int count = 0;
            for (int j = 0; j < 4; j++) {
                int nr = row + dx[j];
                int nc = col + dy[j];
                if (inRange(n, nr, nc) && points[nr][nc] == 1) {
                    count++;
                }
            }
            System.out.println(count == 3 ? 1 : 0);
        }

        // Please write your code here.
    }

    public static boolean inRange(int n, int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}