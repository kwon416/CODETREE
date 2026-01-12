import java.util.Scanner;
public class Main {
    public static int[][] arr;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < n; k++) {
                    if (i == k) {
                        for (int l = j + 3; l < n; l++) {
                            if (inRange(k, l+2)) {
                                int sum = sumArr(i, j, k, l);
                                max = Math.max(max, sum);
                            }
                        }
                    } else {
                        for (int l = j; l < n; l++) {
                           if (inRange(i, j + 2) && inRange(k, l + 2)) {
                            int sum = sumArr(i, j, k, l);
                            max = Math.max(max, sum);
                           }
                        }
                    }
                }     
            }
        }
        System.out.print(max);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int sumArr(int i , int j , int k, int l) {
        return arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[k][l] +arr[k][l+1] + arr[k][l+2];
    }
}