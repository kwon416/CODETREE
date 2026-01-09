import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.
        int[] xy = getPosition(n, startNum);
        int x = xy[0];
        int y = xy[1];
        int dir = xy[2];
        int count = 0;
        while (inRange(n, x, y)) {
            dir = changeDir(grid[x][y], dir);
            count++;
            x += dx[dir];
            y += dy[dir];
        }
        System.out.println(count);

    }

    public static int changeDir(char c, int dir) {
        if (c == '/') {
            // 3 <-> 0, 2 <-> 1
            return 3 - dir;
        } else {
            // 3 <-> 2, 1 <-> 0
            if (dir == 3) return 2;
            if (dir == 2) return 3;
            if (dir == 1) return 0;
            return 1;
        }
    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int[] getPosition(int n, int k) {
        int[] arr = new int[3];

        if (k <= n) {
            arr[0] = 0;
            arr[1] = k - 1;
            arr[2] = 1;
        } else if (k <= 2 * n) {
            arr[0] = k - n - 1;
            arr[1] = n - 1;
            arr[2] = 2;
        } else if (k <= 3 * n) {
            arr[0] = n - 1;
            arr[1] = 3 * n - k;
            arr[2] = 0;
        } else {
            arr[0] = 4 * n - k;
            arr[1] = 0;
            arr[2] = 3;
        }
        return arr;
    }
}