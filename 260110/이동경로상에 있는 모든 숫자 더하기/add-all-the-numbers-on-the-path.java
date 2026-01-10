import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{-1, 0, 1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int x = n / 2;
        int y = n / 2;
        int sum = board[x][y];
        int dir = 0;

        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);
            if (c == 'R') {
                dir = (dir + 1) % 4;
            } else if (c == 'L') {
                dir = (dir - 1 + 4) % 4;
            } else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (inRange(n, nx, ny)) {
                    x = nx;
                    y = ny;
                    sum += board[x][y]; 
                }
            }
        }
        System.out.print(sum);

    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}