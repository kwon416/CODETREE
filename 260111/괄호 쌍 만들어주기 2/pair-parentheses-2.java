import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 2; j < n - 1; j++) {
                if (check(input, i, j)) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    public static boolean check(String s, int i , int j) {
        if (s.charAt(i) == '(' && s.charAt(i + 1) == '(' && s.charAt(j) == ')' && s.charAt(j+1) == ')') {
            return true;
        }
        return false;
    }
}