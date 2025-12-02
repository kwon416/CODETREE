import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.
        int[][] area = new int[2001][2001];

        for (int i = rect1_x1; i < rect1_x2; i++) {
            for (int j = rect1_y1; j < rect1_y2; j++) {
                area[i][j] = 1;
            }
        }

        for (int i = rect2_x1; i < rect2_x2; i++) {
            for (int j = rect2_y1; j < rect2_y2; j++) {
                area[i][j] = 0;
            }
        }

        int minX, maxX, minY, maxY = 0;

    }
}