import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int x = 1;
        while (true) {
            int num = x;
            boolean find = true;
            for (int i = 0; i < n; i++) {
                num *= 2;
                if (num < a[i] || num > b[i]) {
                    find = false;
                }
            }
            if (find) break;
            x++;
        }
        System.out.print(x);
    }
}