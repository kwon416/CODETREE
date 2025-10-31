import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(recursive(n));
    }

    static int recursive(int n) {
        if (n == 1) return 0;

        if (n % 2 == 0) {
            return recursive(n / 2) + 1;
        } else {
            return recursive(n / 3) + 1;
        }
    }
}