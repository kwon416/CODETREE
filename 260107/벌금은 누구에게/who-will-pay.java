import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] counts = new int[n];
        int ans = -1;
        for (int i = 0; i < m; i++) {
            int index = sc.nextInt() - 1;
            if (++counts[index] == k) {
                ans = index + 1;
                break;
            }            
        }
        // Please write your code here.
        System.out.println(ans);
    }
}