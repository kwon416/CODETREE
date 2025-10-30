import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isNum(i)) count++;
        }
        System.out.println(count);
    }

    static boolean isNum(int i) {
        int sum = 0;
        int n = i;
        while (true) {
            sum += n % 10;
            if (n / 10 == 0) break;
            n /= 10;
        }
        if (isPrime(i) && sum % 2 == 0) return true;
        return false;
    }

    static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a < 2) return false;
            if (a % i == 0) return false;
        }
        return true;
    }
}