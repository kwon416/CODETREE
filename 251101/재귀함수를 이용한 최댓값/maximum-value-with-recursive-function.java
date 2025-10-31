import java.util.Scanner;
public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(r(n - 1));
    }

    static int r(int n) {
        if (n == 0) return arr[0];

        return Math.max(r(n-1), arr[n]);
    }
    
    
}