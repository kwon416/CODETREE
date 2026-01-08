import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int time = Math.max(n, m) * 1000;
        int[] a = new int[time];
        int[] b = new int[time];

        int[] honor = new int[time];

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                a[timeA] = a[timeA - 1] + v;
                timeA++;
            }
            
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                b[timeB] = b[timeB - 1] + v;
                timeB++;
            }
        }
        // Please write your code here.
        // A = 1, B = 2
        int head = 0;
        int count = 0;
        for (int i = 1; i < time; i++) {
            if (a[i] == 0 && b[i] == 0) break;
            // System.out.println("a: " + a[i] + "  / b: " + b[i]);

            int newHead = 0;
            if (a[i] > b[i]) {
                newHead = 1;
            } else if (b[i] > a[i]) {
                newHead = 2;
            } else {
                newHead = 3;
            }
            if (head != newHead) {
                count++;
            }
            head = newHead;
        }

        System.out.println(count);

    }
}