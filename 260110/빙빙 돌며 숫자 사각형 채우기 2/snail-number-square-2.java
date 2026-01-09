import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int[][] grid = new int[n][m];

        int x = 0;
        int y = 0;
        int dir = 0;
        grid[x][y] = 1;
        for (int i = 2; i <= n * m; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(n, m, nx, ny) || grid[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            grid[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int n, int m, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}