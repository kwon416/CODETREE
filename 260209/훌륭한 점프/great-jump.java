import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 100; i >= Math.max(arr[0], arr[n - 1]); i--) {
            boolean posible = true;
            int[] availableIndices = new int[n];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] <= i) {
                    availableIndices[cnt++] = j;
                }
            }
            for (int j = 1; j < cnt; j++) {
                int dist = availableIndices[j] - availableIndices[j - 1];
                if (dist > k) {
                    posible = false;
                }
            }
            if (posible) {
                min = Math.min(min, i);
            } else {
                break;
            }
        }
        System.out.print(min);
    }
}