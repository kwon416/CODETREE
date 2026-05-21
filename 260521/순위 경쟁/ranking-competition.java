import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String honor = "ABC";
        int a = 0, b = 0, c = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            int s = sc.nextInt();
            if (ch == 'A') a += s;
            if (ch == 'B') b += s;
            if (ch == 'C') c += s;
            // 1. 전부 1등
            String str = "";
            if (a == b && b == c) {
                str = "ABC";
            }
            if (a == b && b > c) {
                str = "AB";
            }
            if (b == c && c > a) {
                str = "BC";
            }
            if (a == c && c > b) {
                str = "AC";
            }
            if (a > b && a > c) {
                str = "A";
            }
            if (b > a && b > c) {
                str = "B";
            }
            if (c > a && c > b) {
                str = "C";
            }

            if (!str.equals(honor)) {
                cnt++;
            }
            honor = str;
        }
        // Please write your code here.
        System.out.print(cnt);
    }
}