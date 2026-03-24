import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int dist1 = Math.abs(B - A);
        int dist2 = Math.abs(A - x) + Math.abs(y - B);
        int dist3 = Math.abs(A - y) + Math.abs(x - B);

        int min = Math.min(dist1, Math.min(dist2, dist3));

        System.out.print(min);
    }
}