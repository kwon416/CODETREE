import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        
        Arrays.sort(B);
        int ans = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] arr = new int[M];
            for (int j = i; j < i + M; j++) {
                arr[j - i] = A[j];
            }

            Arrays.sort(arr);
            boolean isBeautiful = true;
            for (int j = 0; j < M; j++) {
                if (arr[j] != B[j]) isBeautiful = false;
            }
            if (isBeautiful) ans++;
        }
        System.out.print(ans);
    }
}