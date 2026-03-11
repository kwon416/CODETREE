import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        for (int h = 1; h <= 100; h++) {
            int nl = l;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] >= h) {
                    cnt++;
                }
                if (nl > 0 && a[i] + 1 >= h) {
                    cnt++;
                    nl--;
                }
            }

            if (cnt < h || nl < 0) {
                System.out.print(h - 1);
                break;
            }
        }
    }
}