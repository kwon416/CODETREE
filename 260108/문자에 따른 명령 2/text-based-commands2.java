import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.

        int index = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                index = (index - 1 + 4) % 4;
            } else if (c == 'R') {
                index = (index + 1) % 4;
            } else {
                x += dx[index];
                y += dy[index];
            }
        }
        System.out.println(x + " " + y);

    }
}