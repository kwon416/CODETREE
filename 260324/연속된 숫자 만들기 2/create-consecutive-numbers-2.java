import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        if (a[0] + 1 == a[1] && a[1] + 1 == a[2]) {
            System.out.print(0);
        } else if (a[0] + 2 == a[1] || a[1] + 2 == a[2]) {
            System.out.print(1);
        } else {
            System.out.print(2);
        }
    }
}