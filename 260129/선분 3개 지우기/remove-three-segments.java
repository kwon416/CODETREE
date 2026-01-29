import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int[] arr = new int[101];
                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = a[l]; m <= b[l]; m++) {
                            arr[m]++;
                        }
                    }

                    boolean flag = true;
                    for (int l = 0; l < 101; l++) {
                        if (arr[l] > 1) {
                            flag =false;
                            break;
                        }
                    }
                    if (flag) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}