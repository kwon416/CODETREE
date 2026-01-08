import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        // Please write your code here.

        int x = R - 1;
        int y = C - 1;
        int index = getDir(D);
        while (T > 0) {
            int newX = x + dx[index];
            int newY = y + dy[index];
            if (inRange(N, newX, newY)) {
                // 이동
                x = newX;
                y = newY;
            } else {
                // 방향 전환
                index = 3 - index;
            }
            T--;
        }
        x++;
        y++;
        System.out.println(x + " " + y);
    }

    public static boolean inRange(int n, int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int getDir(String s) {
        if (s.equals("R")) {
            return 0;
        } else if (s.equals("D")) {
            return 1;
        } else if (s.equals("L")) {
            return 3;
        } else {
            return 2;
        }
        
    }
}