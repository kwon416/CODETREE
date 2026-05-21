import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        if(n == 3) {
            // n=3이면 그냥 세 숫자 곱
            System.out.println(arr[0] * arr[1] * arr[2]);
            return;
        }

        Arrays.sort(arr); // 오름차순 정렬

        int len = n;
        // 후보 1: 가장 큰 양수 3개
        int max1 = arr[len - 1] * arr[len - 2] * arr[len - 3];

        // 후보 2: 가장 작은 음수 2개 × 가장 큰 양수 1개
        int max2 = arr[0] * arr[1] * arr[len - 1];

        // 최댓값
        int max = Math.max(max1, max2);

        System.out.println(max);
    }
}