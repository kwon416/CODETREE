import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.print(season(y, m, d));
    }

    static String season(int y, int m, int d) {
        if (!isExist(y, m, d)) return "-1";
        if (3 <=m && m <= 5) return "Spring";
        if (6 <= m && m <= 8) return "Summer";
        if (9 <=m && m <= 11) return "Fall";
        else return "Winter";
    }

    static boolean isLeap(int y) {
        if (y % 4 != 0) return false;
        if (y % 100 == 0) return false;
        if (y % 100 == 0 && y % 400 != 0) return false;
        return true;
    }

    static boolean isExist(int y, int m, int d) {
        if (m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
            if (d == 31) return false;
        }
        if (m == 2) {
            if (isLeap(y)) {
                if (d > 29) return false;
            } else {
                if (d > 28) return false;
            }
        }
        return true;
    }
}