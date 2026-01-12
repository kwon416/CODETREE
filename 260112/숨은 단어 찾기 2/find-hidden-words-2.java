import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = new int[]{1, 1, 0, -1, -1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 8;  k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    int nx2 = i + dx[k] * 2;
                    int ny2 = j + dy[k] * 2;
                    if (inRange(n , m, nx, ny) && inRange(n, m, nx2, ny2)) {
                        if (arr[i][j].equals("L") && arr[nx][ny].equals("E") && arr[nx2][ny2].equals("E")) {
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean inRange(int n, int m, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}