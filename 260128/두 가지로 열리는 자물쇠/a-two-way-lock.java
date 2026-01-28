import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (
                        (getDist(i, a) <= 2 && getDist(j, b) <= 2 && getDist(k, c) <= 2) ||
                        (getDist(i, a2) <= 2 && getDist(j, b2) <= 2 && getDist(k, c2) <= 2) 
                    ) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }

    public static int getDist(int i, int j) {
        return Math.min(Math.abs(i - j), n - Math.abs(i - j));
    }
}