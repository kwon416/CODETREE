import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 1000;
        int[] arr = new int[2000];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'L') {
                for (int j = 0; j < x; j++) {
                    arr[--point]++;
                }
            } else {
                for (int j = 0; j < x; j++) {
                    arr[point++]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 2000; i++) {
            if (arr[i] > 1) {
                count++;
            }
        }
        System.out.print(count);
    }
}