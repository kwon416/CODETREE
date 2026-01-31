import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();
        // Please write your code here.
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            arr[0][i] = Character.getNumericValue(inp1.charAt(i));
            arr[1][i] = Character.getNumericValue(inp2.charAt(i));
            arr[2][i] = Character.getNumericValue(inp3.charAt(i));
        }
        // for (int i = 0; i <3; i++) {
        //     for (int j = 0; j <3; j++) {
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }

        int ans = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = i + 1; j <= 9; j++) {
                boolean win = false;

                int num1 = 0;
                int num2 = 0;

                // 가로
                for (int k = 0; k < 3; k++) {
                    num1 = 0;
                    num2 = 0;
                    for (int l = 0; l < 3; l++) {
                        if (arr[k][l] == i) {
                            num1++;
                        } 
                        if (arr[k][l] == j) {
                            num2++;
                        }
                    }
                    if (num1 + num2 == 3 && num1 >= 1 && num2 >= 1) {
                        win = true;
                    }
                }

                for (int k = 0; k < 3; k++) {
                    num1 = 0;
                    num2 = 0;
                    for (int l = 0; l < 3; l++) {
                        if (arr[l][k] == i) num1++;
                        if (arr[l][k] == j) num2++;
                    }
                    if (num1 + num2 == 3 && num1 >= 1 && num2 >= 1) {
                        win = true;
                    }
                }

                num1 = 0;
                num2 = 0;
                for (int k = 0; k < 3; k++) {
                    if (arr[k][k] == i) num1++;
                    if (arr[k][k] == j) num2++;
                }
                if (num1 + num2 == 3 && num1 >= 1 && num2 >= 1) {
                    win = true;
                }

                num1 = 0;
                num2 = 0;

                for (int k = 0; k < 3; k++) {
                    if (arr[k][3 - k - 1] == i) num1++;
                    if (arr[k][3 - k - 1] == j) num2++;
                }
                if (num1 + num2 == 3 && num1 >= 1 && num2 >= 1) {
                    win = true;
                }
                if (win) ans++;

            }
        }
        System.out.print(ans);
    }
    
}