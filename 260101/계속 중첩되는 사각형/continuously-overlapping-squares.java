import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            int color = i % 2;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k] = color;
                }
            }
             
        }
        int count = 0;
        // Please write your code here.
        for (int j = 0; j < 201; j++) {
            for (int k = 0; k < 201; k++) {
                // System.out.print(arr[j][k]);
                if (arr[j][k] == 1) {
                    count++;
                }
            }
            // System.out.println();
        }
        System.out.print(count);
    }
}