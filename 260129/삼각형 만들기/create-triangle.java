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
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 한 변이 평행
                    int xLen = 0;
                    int yLen = 0;
                    if (y[i] == y[j]) xLen = Math.abs(x[i] - x[j]);
                    if (y[k] == y[j]) xLen = Math.abs(x[k] - x[j]);
                    if (y[i] == y[k]) xLen = Math.abs(x[i] - x[j]);

                    if (x[i] == x[j]) yLen = Math.abs(y[i] - y[j]);
                    if (x[i] == x[k]) yLen = Math.abs(y[i] - y[k]);
                    if (x[k] == x[j]) yLen = Math.abs(y[k] - y[j]);

                    if (xLen != 0 && yLen != 0) {
                        max = Math.max(max, xLen * yLen);
                    }
                }
            }
        }
        System.out.print(max);
    }
}