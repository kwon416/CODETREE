import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seats = sc.next().toCharArray();
        // Please write your code here.

        // 인접한 쌍들 중 가장 먼 쌍
        int maxDist = 0;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (seats[j] == '1') {
                        // 두 쌍을 고름
                        if (j - i > maxDist) {
                            maxDist = j - i;

                            maxI = i;
                            maxJ = j;
                        }

                        // 인접 쌍을 찾았으니 탈출
                        break;
                    }
                }
            }
        }

        // 최적의 위치에 1을 놓는다
        seats[(maxI + maxJ) / 2] = '1';

        // 다시 인접 쌍중 가장 가까운 쌍 찾기
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (seats[i] == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (seats[j] == '1') {
                        ans = Math.min(ans, j - i);
                        break;
                    }
                }
            }
        }
        System.out.print(ans);
    }
}