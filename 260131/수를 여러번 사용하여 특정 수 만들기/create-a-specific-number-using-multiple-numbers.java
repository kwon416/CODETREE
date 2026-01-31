import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for (int i = 0; i <= C; i += A) {
            for (int j = 0; j <= C; j += B) {
                int sum = i + j;
                if (sum <= C) {
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.print(max);
    }
}