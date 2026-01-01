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
        int startIdx = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int len = i - startIdx;
                maxCount = Math.max(maxCount, len);
                startIdx = i;
            }
        }
        maxCount = Math.max(maxCount, n - startIdx);
        System.out.println(maxCount);
    }
}