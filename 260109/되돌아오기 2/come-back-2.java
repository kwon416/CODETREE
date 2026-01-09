import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int time = 0;
        int x = 0;
        int y = 0;
        int index = 0;
        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);

            if (c == 'R') {
                index = (index + 1) % 4;
            } else if (c == 'L') {
                index = (index -1 + 4) % 4;
            } else {
                x += dx[index];
                y += dy[index];
            }
            time++;
            if (x == 0 && y == 0) break;
        }
        if (x != 0 && y != 0) time = -1;

        System.out.println(time);
    }
}