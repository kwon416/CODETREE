import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int x = n / 2;
        int y = n / 2;
        int dir = 0;
        int[][] grid = new int[n][n];
        gird[x][y] = 1;

        for (int i = 2; i <= n * n; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(n, nx, ny) || grid[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            gird[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(gird[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}