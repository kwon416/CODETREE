import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int min1 = 11 * 24 * 60 + 11 * 60 + 11;
        int min2 = A * 24 * 60 + B * 60 + C;
        System.out.println(min1 <= min2 ? Math.abs(min1 - min2) : -1);
    }
}