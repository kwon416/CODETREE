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

        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                for (int k = 0; k <= 20; k++) {
                    boolean flag = true;
                    // 세 선을 찍고
                    // 모든 점이 세 선 위에 있다면 가능
                    for (int l = 0; l < n; l++) {
                        if (x[l] != i && x[l] != j && x[l] != k &&
                            y[l] != i && y[l] != j && y[l] != k
                        ) {
                            //선 위에 없음
                            flag = false;
                        }
                    }
                    // 
                    if (flag) ans = 1;
                }
            }    
        }
        System.out.print(ans);
    }   
}