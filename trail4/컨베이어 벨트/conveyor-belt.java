import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.
        int time = 0;
        while (time != t) {
            int topTemp = top[n - 1];
            int botTemp = bottom[n - 1];

            for (int i = n - 1; i > 0; i--) {
                top[i] = top[i - 1];
                bottom[i] = bottom[i - 1];
            }

            top[0] = botTemp;
            bottom[0] = topTemp;

            time++;
        }

        for (int a : top) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : bottom) {
            System.out.print(a + " ");
        }
    }   
}