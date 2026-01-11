import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int dist = 0;
            int prevIdx = 0;
            for (int j = 1; j < n; j++) {
                if (j == i) continue;
                dist += Math.abs(x[prevIdx] - x[j]) + Math.abs(y[prevIdx] - y[j]);
                prevIdx = j;
            }
            min = Math.min(min, dist);
        }
        System.out.print(min);
    }
}