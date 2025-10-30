import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.println(check(A) ? "Yes" : "No");
    }

    static boolean check(String A) {
        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) != A.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}