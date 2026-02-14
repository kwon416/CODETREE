import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[1000];
        for (int i = 1; i <= n; i++) {
            arr[0] = i;

            for (int j = 1; j < n; j++) {
                arr[j] = a[j - 1] - arr[j - 1];
            }

            boolean satisfied = true;
            boolean[] exist = new boolean[1001];
            for (int j = 0; j < n; j++) {
                if (arr[j] <= 0 || arr[j] > n) {
                    satisfied = false;
                } else {
                    if (exist[arr[j]]) {
                        satisfied = false;
                    }
                    exist[arr[j]] = true;
                }
            }
            if (satisfied) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}