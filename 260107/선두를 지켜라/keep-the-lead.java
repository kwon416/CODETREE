import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        
        int[][] location = new int[1000000][2];
        int indexA = 1;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            int v = A[i][0];
            int t = A[i][1];
            while(t-- > 0) {
                location[indexA][0] = location[indexA - 1][0] + v;
                indexA++;
            }
        }
        int[][] B = new int[m][2];
        int indexB = 1;
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc. nextInt();
            int v = B[i][0];
            int t = B[i][1];
            while(t-- > 0) {
                location[indexB][1] = location[indexB - 1][1] + v;
                indexB++;
            }
        }
        // Please write your code here.
        int count = 0;
        int headIndex = 0;

        for (int i = 1; i < 1000000; i++) {
            int index = getHead(location[i][0], location[i][1]);
            if (index != -1 && headIndex != index) {
                count++;
                headIndex = index;
            }
            if (location[i][0] == 0 && location[i][1] == 0) break;
        }

        System.out.print(count == 0 ? count : count - 1);
    }

    public static int getHead(int i, int j) {
        int head = i - j;
        if (head == 0) return -1;
        if (head > 0) return 0;
        return 1;
    }
}