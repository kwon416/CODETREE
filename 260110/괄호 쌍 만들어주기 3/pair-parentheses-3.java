import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == '(' && str.charAt(j) == ')') {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}