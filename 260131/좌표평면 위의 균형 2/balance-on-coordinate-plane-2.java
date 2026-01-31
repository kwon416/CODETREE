import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 2; i <= 100; i += 2) {
            for (int j = 2; j <= 100; j += 2) {
                int max = 0;
                int s1 = 0;
                int s2 = 0;
                int s3 = 0;
                int s4 = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] > i && y[k] > j) {
                        s1++;
                    } else if (x[k] < i && y[k] > j) {
                        s2++;
                    } else if (x[k] < i && y[k] < j) {
                        s3++; 
                    } else {
                        s4++;
                    }
                }
                max = Math.max(Math.max(s1, s2), Math.max(s3, s4));
                min = Math.min(min, max);
            }
        }
        System.out.print(min);
        
    }
}