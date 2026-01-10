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
        for (int i = 1; i < n-2; i++) {
            int sum = 0;
            for (int j = 0; j < n -1; j++) {
                int dist = Math.abs(x[j + 1] - x[j]) + Math.abs(y[j + 1] - y[j]);
                sum += dist;
                if (i == j) {
                    sum = sum 
                    - Math.abs(x[i - 1] - x[i]) - Math.abs(y[i - 1] - y[i])
                    - Math.abs(x[i + 1] - x[i]) - Math.abs(y[i + 1] - y[i])
                    + Math.abs(x[i - 1] - x[i + 1]) + Math.abs(y[i - 1] - y[i + 1]);
                }
             }
             min = Math.min(min, sum);
        }
        System.out.print(min);
    }
}