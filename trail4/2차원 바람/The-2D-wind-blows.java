import java.util.Scanner;
public class Main {
    public static int n, m, r1, c1, r2, c2;
    public static int[][] building, copy;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int q = sc.nextInt();
        building = new int[n + 2][m + 2];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                building[i][j] = sc.nextInt();
        
        
        for (int i = 0; i < q; i++) {
            r1 = sc.nextInt();
            c1 = sc.nextInt();
            r2 = sc.nextInt();
            c2 = sc.nextInt();

            // 시계방향 회전
            // 맨 위 가로를 오른쪽으로 쉬프트
            int temp = building[r1][c2];
            for (int j = c2; j > c1; j--) {
                building[r1][j] = building[r1][j - 1];
            }
            // 왼쪽 세로를 위로쉬프트
            for (int j = r1; j < r2; j++) {
                building[j][c1] = building[j + 1][c1];
            }
            // 아래 가로를 왼쪽 쉬프트
            for (int j = c1; j < c2; j++) {
                building[r2][j] = building[r2][j + 1];
            }
            // 왼쪽 세로를 아래 쉬프트
            for (int j = r2; j > r1; j--) {
                building[j][c2] = building[j - 1][c2];
            }
            // 마지막 하나 넣기
            building[r1 + 1][c2] = temp;

            // 영역 복제 후 평균 계산해서 원본에 삽입
            setNewValue();

        }
        // Please write your code here.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(building[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void setNewValue() {
        copy = new int[n + 2][m + 2];

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                int sum = building[i][j];
                int cnt = 1;
                if (inRange(i - 1, j)) {
                    sum += building[i - 1][j]; // 상
                    cnt++;
                }
                if (inRange(i + 1, j)) {
                    sum += building[i + 1][j]; // 하
                    cnt++;
                }
                if (inRange(i, j - 1)) {
                    sum += building[i][j - 1]; // 좌
                    cnt++;
                }
                if (inRange(i, j + 1)) {
                    sum += building[i][j + 1]; // 우
                    cnt++;
                }

                copy[i][j] = sum / cnt;
            }
        }

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                building[i][j] = copy[i][j];
            }
        }
    }

    public static boolean inRange(int i, int j) {
        return 1 <= i && i <= n && 1 <= j && j <= m;
    }
}