import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int ans = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                // 가로 체크
                if (j <= 14) {
                    if (arr[i][j] == 2 && arr[i][j+1] == 1 && arr[i][j+2] == 1 && arr[i][j+3] == 1 && arr[i][j+4] == 1) {
                        ans = 1;
                        x = i;
                        y = j + 2;
                    }
                    if (arr[i][j] == 2 && arr[i][j+1] == 2 && arr[i][j+2] == 2 && arr[i][j+3] == 2 && arr[i][j+4] == 2) {
                        ans = 2;
                        x = i;
                        y = j + 2;
                    }
                }

                // 세로 체크
                if (i <= 14) {
                    if (arr[i][j] == 1 && arr[i + 1][j] == 1 && arr[i + 2][j] == 1 && arr[i + 3][j] == 1 && arr[i + 4][j] == 1)  {
                        ans = 1;
                        x = i + 2;
                        y = j;
                    }
                    if (arr[i][j] == 2 && arr[i + 1][j] == 2 && arr[i + 2][j] == 2 && arr[i + 3][j] == 2 && arr[i + 4][j] == 2)  {
                        ans = 2;
                        x = i + 2;
                        y = j;
                    }
                } 

                // 대각선 체크
                if (i < 14 && j < 14) {
                    // \모양
                    if (arr[i][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j + 2] == 1 && arr[i + 3][j + 3] == 1 && arr[i + 4][j + 4] == 1)  {
                        ans = 1;
                        x = i + 2;
                        y = j + 2;
                    }
                    if (arr[i][j] == 2 && arr[i + 1][j + 1] == 2 && arr[i + 2][j + 2] == 2 && arr[i + 3][j + 3] == 2 && arr[i + 4][j + 4] == 2)  {
                        ans = 2;
                        x = i + 2;
                        y = j + 2;
                    }
                }
                if (i <= 14 && j >= 4) {
                    // /모양
                    if (arr[i][j] == 1 && arr[i + 1][j - 1] == 1 && arr[i + 2][j - 2] == 1 && arr[i + 3][j - 3] == 1 && arr[i + 4][j - 4] == 1) {
                        ans = 1;
                        x = i + 2;
                        y = j - 2;
                    }
                    if (arr[i][j] == 2 && arr[i + 1][j - 1] == 2 && arr[i + 2][j - 2] == 2 && arr[i + 3][j - 3] == 2 && arr[i + 4][j - 4] == 2){
                        ans = 2;
                        x = i + 2;
                        y = j - 2;
                    }
                }
            }
        }

        System.out.println(ans);
        if (x != 0 && y != 0) {
            x++;
            y++;
            System.out.println(x + " " + y);
        }
    }
}