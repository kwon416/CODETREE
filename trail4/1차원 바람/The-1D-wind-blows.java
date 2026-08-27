import java.util.Scanner;

public class Main {
    public static int[][] a;
    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int q = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int r = sc.nextInt();
            char d = sc.next().charAt(0);

            // push
            push(r- 1, d);

            int up = r - 2; // index로 변환
            int down = r;
            char upD = changeDirection(d);
            char downD = changeDirection(d);

            while (up >= 0) {
                if (canPropagate(up, up + 1)) {
                    push(up, upD);
                    upD = changeDirection(upD);
                    up--;
                } else {
                    break;
                }
            }

            while (down < n) {
                if (canPropagate(down, down - 1)) {
                    push(down, downD);
                    downD = changeDirection(downD);
                    down++;
                } else {
                    break;
                }
            }

        }
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static char changeDirection(char c) {
        return c == 'L' ? 'R' : 'L';
    }

    public static boolean canPropagate(int x, int y) {
        for (int i = 0; i < m; i++) {
            if (a[x][i] == a[y][i]) return true;
        }
        return false;
    }

    public static void push(int i, char d) {
        if (d == 'L') {
            int temp = a[i][m - 1];
            for (int j = m - 1; j > 0; j--) {
                a[i][j] = a[i][j - 1];
            }
            a[i][0] = temp;
        } else {
            int temp = a[i][0];
            for (int j = 0; j < m - 1; j++) {
                a[i][j] = a[i][j + 1];
            }
            a[i][m - 1] = temp;
        }
    }
}