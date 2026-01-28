import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int minX = 40000;
            int maxX = 1;
            int minY = 40000;
            int maxY = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);                
            }
            min = Math.min(min, (maxX - minX) * (maxY - minY));
        }
        System.out.print(min);
    }
}