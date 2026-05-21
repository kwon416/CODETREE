import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            sum += blocks[i];
        }
        sum /= n;
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += Math.abs(blocks[i] - sum);
        }
        System.out.print(cnt / 2);
        // int min = 1;
        // int max = 10000;
        // while (min != max) {
        //     for (int i = 0; )
        // }
    }
}