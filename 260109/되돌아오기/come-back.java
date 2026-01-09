import java.util.Scanner;
public class Main {

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // Please write your code here.
        int x = 0;
        int y = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            int index = getDir(dir);
            while (dist-- > 0) {
                x += dx[index];
                y += dy[index];
                count++;
                if (x == 0 && y == 0) break;
            }
            if (x == 0 && y == 0) break;
        }
        if (x != 0 && y != 0) count = -1;
        System.out.println(count);

    }

    public static int getDir(char dir) {
        if (dir == 'E') {
            return 0;
        } else if (dir == 'S') {
            return 1;
        } else if (dir == 'W') {
            return 2;
        } else {
            return 3;
        }
    }
}