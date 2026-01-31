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
        int ans = 0;

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 10; k++) {
                    boolean flag = true;
                    // x 축 세개
                    for (int l = 0; l < n; l++) {
                        if (x[l] == i || x[l] ==j || x[l] ==k) {
                            continue;
                        }
                        flag = false;
                    }
                    
                    if (flag) ans = 1;

                    // x축 2개 y축 1개
                    flag = true;
                    for (int l = 0; l < n; l++) {
                        if (x[l] == i || x[l] == j || y[l] == k) {
                            continue;
                        }
                        flag = false;
                    }
                    if (flag) ans = 1;

                    // x축 1개 y축 2개
                    flag = true;
                    for (int l = 0; l < n; l++) {
                        if (x[l] == i || y[l] == j || y[l] == k) {
                            continue;
                        }
                        flag = false;
                    }
                    if (flag) ans = 1;

                    // y 3개
                    flag = true;
                    for (int l = 0; l < n; l++) {
                        if (y[l] == i || y[l] == j || y[l] == k) {
                            continue;
                        }
                        flag = false;
                    }
                    if (flag) ans = 1;
                }
            }    
        }
        System.out.print(ans);
    }   
}