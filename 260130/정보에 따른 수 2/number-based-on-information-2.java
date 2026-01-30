import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] arr = new char[1001];
        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0);
            int pos = sc.nextInt();
            arr[pos] = c;
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            int d1 = Integer.MAX_VALUE;
            int d2 = Integer.MAX_VALUE;
            for (int j = 0; j < 1000; j++) {
                int left = i - j;
                int right = i + j;
                if (left > 0) {
                    if (arr[left] == 'S') d1 = Math.min(d1, j);
                    if (arr[left] == 'N') d2 = Math.min(d2, j);
                }
                if (right <= 1000) {
                    if (arr[right] == 'S') d1 = Math.min(d1, j);
                    if (arr[right] == 'N') d2 = Math.min(d2, j);
                }
            }
            if (d1 <= d2) cnt++;
        }
        System.out.print(cnt);
    }
}