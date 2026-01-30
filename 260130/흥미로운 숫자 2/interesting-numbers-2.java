import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = x; i <= y; i++) {
            int num = i;

            int length = (num + "").length();

            int[] arr = new int[10];
            while (true) {
                arr[num % 10]++;
                num /= 10;
                if (num == 0) break;
            }
            for (int j : arr) {
                if (j == length - 1) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}