import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i - k; j <= i + k; j++) {
                if (i == j || j < 0 || j >= n) continue;
                if (bombs[i] == bombs[j]) {
                    max = Math.max(max, bombs[i]);
                }
            }
        }
        System.out.print(max);
    }
}