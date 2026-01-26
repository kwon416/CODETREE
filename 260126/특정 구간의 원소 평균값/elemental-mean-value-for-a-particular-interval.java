import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                double avg = (double) sum / (j - i + 1);
                for (int k = i; k <= j; k++) {
                    if (avg == (double) arr[k]) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}