import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') s.push('(');
            else {
                if (s.isEmpty()) {
                    System.out.println("No");
                    return;
                } else {
                    s.pop();
                }
            };
        }

        System.out.println(s.isEmpty() ? "Yes" : "No");
    }
}