import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        gcd(n, m);    
    }

    public static void gcd(int n, int m) {
            int i = Math.min(n, m);
            while (true) {
                if (i == 0) break;
                if (n % i == 0 && m % i == 0) {
                    break;
                }
                i--;
            }
            System.out.println(i);
        }
}