import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[200000][3]; 
        // arr[][0] = color ('W','B','G'), arr[][1] = whiteCnt, arr[][2] = blackCnt

        int point = 100000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int step = 0; step < x; step++) {

                // 1) 이미 회색이면 더 이상 칠하지 않음
                if (arr[point][0] != 'G') {

                    // 2) 색칠
                    if (d == 'L') {
                        arr[point][0] = 'W';
                        arr[point][1]++;        // white++
                    } else {
                        arr[point][0] = 'B';
                        arr[point][2]++;        // black++
                    }

                    // 3) 회색 판정
                    if (arr[point][1] >= 2 && arr[point][2] >= 2) {
                        arr[point][0] = 'G';
                    }
                }

                // 4) 다음 칸으로 이동
                if (step < x - 1) {
                    if (d == 'L') point--;
                    else point++;
                }
            }
        }

        int[] ans = new int[3];  // W, B, G

        for (int[] a : arr) {
            if (a[0] == 'W') ans[0]++;
            if (a[0] == 'B') ans[1]++;
            if (a[0] == 'G') ans[2]++;
        }

        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}
