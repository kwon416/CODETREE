import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int x = 0;
        int y =0;
        int dir = 0;
        char c = 'A';
        char[][] grid = new char[n][m];
        grid[x][y] = c;


        for (int i = 1; i < n * m; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(n, m, nx, ny) || grid[nx][ny] != '\u0000') {
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];
            grid[x][y] = (char) (c + i);

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