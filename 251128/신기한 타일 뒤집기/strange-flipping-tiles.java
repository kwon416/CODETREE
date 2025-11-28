import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000];
        int point = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if (d == 'L') {
                arr[point] = 1;
                for (int j = 0; j < x - 1; j++) {
                    point--;
                    arr[point] = 1;
                }
            } else {
                arr[point] = -1;
                for (int j = 0; j < x - 1; j++) {
                    point++;
                    arr[point] = -1;
                }
            }
        }
        int[] answer = new int[2];
        for (int i : arr) {
            if (i == 1) answer[0]++;
            if (i == -1) answer[1]++;
        }
        System.out.print(answer[0] + " " + answer[1]);
        // Please write your code here.
    }
}