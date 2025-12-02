import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt() + 1000;
        int rect1_y1 = sc.nextInt() + 1000;
        int rect1_x2 = sc.nextInt() + 1000;
        int rect1_y2 = sc.nextInt() + 1000;
        int rect2_x1 = sc.nextInt() + 1000;
        int rect2_y1 = sc.nextInt() + 1000;
        int rect2_x2 = sc.nextInt() + 1000;
        int rect2_y2 = sc.nextInt() + 1000;
        // Please write your code here.
        int[][] area = new int[2001][2001];

        for (int i = rect1_x1; i <= rect1_x2; i++) {
            for (int j = rect1_y1; j <= rect1_y2; j++) {
                area[i][j] = 1;
            }
        }

        for (int i = rect2_x1; i <= rect2_x2; i++) {
            for (int j = rect2_y1; j <= rect2_y2; j++) {
                area[i][j] = 0;
            }
        }

        int minX = 2001, maxX = 0, minY = 2001 , maxY = 0;

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (area[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}