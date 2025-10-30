import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        lcm(n, m);
    }

    public static void lcm(int n, int m) {
        int i = Math.max(n, m);
        while (true) {
            if (i % n == 0 && i % m == 0) {
                break;
            }
            i++;
        }
        System.out.print(i);
    }
}