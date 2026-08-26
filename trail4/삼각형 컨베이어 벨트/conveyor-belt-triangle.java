import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        // Please write your code here.
        int time = 0;
        while (time != t) {
            int tl = l[n - 1];
            int tr = r[n - 1];
            int td = d[n - 1];

            for (int i = n - 1; i > 0; i--) {
                l[i] = l[i - 1];
                r[i] = r[i - 1];
                d[i] = d[i - 1];
            }
            l[0] = td;
            r[0] = tl;
            d[0] = tr;
            time++;
        }

        for (int i : l) System.out.print(i + " ");
        System.out.println();
        for (int i : r) System.out.print(i + " ");
        System.out.println();
        for (int i : d) System.out.print(i + " ");
        
    }
}