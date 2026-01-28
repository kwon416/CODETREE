import java.util.Scanner;
public class Main {
    public static int[] abil;
    public static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abil = new int[6];
        sum = 0;
        for (int i = 0; i < 6; i++) {
            abil[i] = sc.nextInt();
            sum += abil[i];
        }
        // Please write your code here.

        // i,j / k, l / 나머지
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (k == i || k == j) continue;
                    for (int l = k + 1; l < 6; l++) {
                        if (l == i || l == j) continue;
                        min = Math.min(min, getDiff(i, j, k, l));
                    }
                }
            }
        }
        System.out.print(min);
    }

    public static int getDiff(int i, int j, int k, int l) {
        int team1 = abil[i] + abil[j];
        int team2 = abil[k] + abil[l];
        int team3 = sum - team1 - team2;

        int max = Math.max(team1, Math.max(team2, team3));
        int min = Math.min(team1, Math.min(team2, team3));
        return max - min;
    }
}