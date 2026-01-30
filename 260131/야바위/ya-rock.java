import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = 0;
        for (int i = 1; i <= 3; i++) {
            int[] arr = new int[4];
            arr[i] = 1;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int temp = arr[a[j]];
                arr[a[j]] = arr[b[j]];
                arr[b[j]] = temp;
                if (arr[c[j]] == 1) {
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}