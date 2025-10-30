import java.util.Scanner;
public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            print(a1, a2);
        }
    }

    public static void print(int a, int b) {
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}