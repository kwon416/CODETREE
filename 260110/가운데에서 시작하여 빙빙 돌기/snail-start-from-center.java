import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int x = n- 1;
        int y = n - 1;
        int dir = 0;
        int[][] grid = new int[n][n];
        grid[x][y] = n * n;

        for (int i = n * n - 1; i > 0; i--) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(n, nx, ny) || grid[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            grid[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}