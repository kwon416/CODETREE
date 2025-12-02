import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] area = new int[201][201];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+ 100;
            y1[i] = sc.nextInt()+ 100;
            x2[i] = sc.nextInt()+ 100;
            y2[i] = sc.nextInt()+ 100;

            setArea(area, x1[i], x2[i], y1[i], y2[i]);
        }
        // Please write your code here.
        int sum = 0;
        for (int [] a : area) {
            for (int i : a) {
                if (i == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

    public static void setArea(int[][] area, int x1, int x2, int y1, int y2) {

        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                area[i][j] = 1;
            }
        }
    }
}