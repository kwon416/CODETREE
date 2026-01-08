import java.util.Scanner;
public class Main {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            if (direction == 'E') {
                while (distance-- > 0) {
                    x += dx[0];
                    y += dy[0];
                }
            } else if (direction == 'S') {
                while (distance-- > 0) {
                    x += dx[1];
                    y += dy[1];
                }
            } else if (direction == 'W') {
                while (distance-- > 0) {
                    x += dx[2];
                    y += dy[2];
                }
            } else {
                while (distance-- > 0) {
                    x += dx[3];
                    y += dy[3];
                }
            }
        }

        System.out.println(x + " " + y);
    }
}