import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] area = new int[201][201];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + 100;
            y[i] = sc.nextInt() + 100;

            for (int j = x[i]; j < x[i] + 8; j++) {
                for (int k = y[i]; k < y[i] + 8; k++) {
                    area[j][k] = 1;
                }
            }
        }
        // Please write your code here.
        int sum = 0;
        for (int[] a : area) {
            for (int i : a) {
                if (i == 1) sum++;
            }
        }
        System.out.print(sum);
    }
}