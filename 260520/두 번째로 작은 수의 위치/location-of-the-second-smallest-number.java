import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = 101;
        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int min2 = 101;
        for (int i = 0; i < N; i++) {
            if (arr[i] != min) {
                if (min2 > arr[i]) {
                    min2 = arr[i];
                }
            }
        }
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == min2) {
                cnt ++;
                if (cnt == 1) {
                    ans = i + 1;
                }
            }
        }
        System.out.print(cnt == 1 ? ans : -1);
    }
}