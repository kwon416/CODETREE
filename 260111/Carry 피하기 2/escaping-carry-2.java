import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (check(arr[i], arr[j], arr[k])) {
                        max = Math.max(max, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
        System.out.print(max);
    }

    public static boolean check(int i, int j, int k) {
        while (true) {
            int ni = i % 10;
            int nj = j % 10;
            int nk = k % 10;

            if (ni + nj + nk >= 10) return false;

            if (i < 10 && j < 10 && k < 10) return true;
            i /= 10;
            j /= 10;
            k /= 10;
        }
    }
}