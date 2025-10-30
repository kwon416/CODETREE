import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.print(isExist(m, d));
    }

    static String isExist(int m ,int d) {
        if (m > 12) return "No";
        if (m == 2 && d > 28) return "No";
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) return "No";
        } else {
            if (d > 30) return "No";
        }
        return "Yes";
    }
}