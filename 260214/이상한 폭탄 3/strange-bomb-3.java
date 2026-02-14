import java.util.Scanner;

public class Main {
    public static int BOMB_NUMS = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        // Please write your code here.
        int max = 0;
        int index = 0;
        for (int i = BOMB_NUMS; i > 0; i--) {
            int[] dist = new int[n];
            int cnt = 0;
            for (int j = 1; j < n; j++) {
                if (bombs[j] == i) {
                    dist[cnt++] = j;    
                }
            }
            int explode = 0;
            for (int j = 1; j < cnt - 1; j++) {
                if (dist[j] - dist[j - 1] <= k || dist[j + 1] - dist[j] <= k) {
                    explode++;
                }
            }
            if (max < explode) {
                max = explode;
                index = i;
            }
        }
        System.out.print(index);
    }
}