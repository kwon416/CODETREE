import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.


        int ans = getMaxSize();
        System.out.println(ans);
    }

    public static int getMaxSize() {
        int size = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j; l < m; l++) {
                        size = Math.max(size, getSize(i, j, k, l));
                    }
                }
            }
        }
        return size;
    }

    public static int getSize(int x1, int y1, int x2, int y2) {
        
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] <= 0) return -1;
            }
        }

        return Math.abs(x2 - x1 + 1) * Math.abs(y2 - y1 + 1);
    }
}