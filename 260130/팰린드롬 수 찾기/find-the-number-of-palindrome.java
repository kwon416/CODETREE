import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = x; i <= y; i++) {
            String s = String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < s.length() / 2 ; j++) {
                if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}