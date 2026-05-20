import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 0, cnt = 0;
        String honor = "AB";
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            // 점수 추가
            if (c == 'A') {
                a += s;
            } else {
                b += s;
            }
            String str  = "";
            // 점수 계산
            if (a > b) {
                str = "A";
            } else if (a < b) {
                str = "B";
            } else {
                str = "AB";
            }

            // 비교
            if (!str.equals(honor)) {
                cnt++;
            }
            honor = str;
        }
        // Please write your code here.
        System.out.print(cnt);
        
    }
}