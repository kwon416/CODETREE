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
        // 최소값 i
        int max = 0;
        for (int i = 0; i <= 10000; i++) {
            // i ~ i + k 에 있는 지
            int cnt = 0;
            for (int j = 0 ; j < n; j++) {
                if (arr[j] >= i && arr[j] <= i + k) {
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}