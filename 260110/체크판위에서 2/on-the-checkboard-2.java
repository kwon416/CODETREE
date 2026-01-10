import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int x = 0;
        int y = 0;
        char c = grid[x][y];
        int cnt = 0;

        for (int i = 1; i < R - 1; i++) {
            for (int j = 1; j < C - 1; j++) {
                for (int k = i + 1; k < R - 1; k++) {
                    for (int l = j + 1; l < C - 1; l++) {
                        if (isDiff(c, grid[i][j]) && isDiff(grid[i][j], grid[k][l])) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }

    public static boolean isDiff(char before, char after) {
        if (before == after) return false;
        return true;
    }
}