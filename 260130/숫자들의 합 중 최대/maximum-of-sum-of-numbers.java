import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for (int i = x; i <= y; i++) {
            int sum = 0;
            int num = i;
            while(true) {

                sum += num % 10;
                num /= 10;
                if (num == 0) break;
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}