import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[1000000];
        int indexA = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while (t-- > 0) {
                if (d == 'R') {
                    A[indexA] = A[indexA - 1] + 1;
                } else {
                    A[indexA] = A[indexA - 1] - 1;
                }
                indexA++;
            }
        }
        int[] B = new int[1000000];
        int indexB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while (t-- > 0) {
                if (d == 'R') {
                    B[indexB] = B[indexB - 1] + 1;
                } else {
                    B[indexB] = B[indexB - 1] - 1;
                }
                indexB++;
            }
        }

        if (indexA < indexB) {
            for (int i = indexA; i < indexB; i++) {
                A[i] = A[i - 1];
            }
        } else if (indexA >indexB) {
            for (int i = indexB; i < indexA; i++) {
                B[i] = B[i - 1];
            }
        }

        int count  = 0;
        int timeMax = 0;
        if(indexA < indexB)
            timeMax = indexB;
        else
            timeMax = indexA;
        for (int i = 1 ; i < timeMax; i++) {
            if (A[i] == B[i] && A[i - 1] != B[i - 1]) count++;
        }
        System.out.print(count);
        // Please write your code here.
    }
}