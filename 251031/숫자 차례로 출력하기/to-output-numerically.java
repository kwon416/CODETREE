import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        asc(n);
        System.out.println();
        desc(n);
    }

    static void asc(int n) {
        if (n == 0) return;

        asc(n - 1);
        System.out.print(n + " ");
    }

    static void desc(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        desc(n - 1);
    }
}