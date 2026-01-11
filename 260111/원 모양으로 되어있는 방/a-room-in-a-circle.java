import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        // 0, 0~n
        // 1, 1 ~ n + 0
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n + i; j++) {
                int dist = (j - i) / n + (j - i) % n;
                sum += dist * arr[j % n];
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}