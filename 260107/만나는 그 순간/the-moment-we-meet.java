import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Please write your code here.
        int[] A = new int[1000000];
        int[] B = new int[1000000];
        A[0] = 0;
        B[0] = 0;
        int indexA = 1;
        int indexB = 1;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (direction == 'R') {
                    A[indexA] = A[indexA - 1] + 1;
                } else {
                    A[indexA] = A[indexA - 1] - 1;
                }
                indexA++;
            }
        }

        for (int i = 0; i < m; i++) {
            char direction = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (direction == 'R') {
                    B[indexB] = B[indexB - 1] + 1;
                } else {
                    B[indexB] = B[indexB - 1] - 1;
                }
                indexB++;
            }
        }


        int index = -1;
        for (int i = 1; i < 1000000; i++) {
            // System.out.println(A[i] + " " + B[i]);
            if (A[i] == B[i]) {
                if (A[i] == 0 && B[i] == 0) break;
                index  = i;
                break;
            }
        }
        System.out.println(index);
    }

}
