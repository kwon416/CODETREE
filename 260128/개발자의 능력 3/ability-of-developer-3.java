import java.util.Scanner;

public class Main {
    public static int[] ability;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    min = Math.min(min, getDiff(i, j, k));
                }
            }
        }
        System.out.print(min);
    }

    public static int getDiff(int i, int j, int k) {
        int sum1 = ability[i] + ability[j] + ability[k];
        int sum2 = 0;
        for (int l = 0; l < ability.length; l++) {
            sum2 += ability[l];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }
}